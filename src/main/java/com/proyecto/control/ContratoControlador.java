/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control;

import com.proyecto.beans.Contrato;
import com.proyecto.beans.Empleado;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juvitec
 */
public class ContratoControlador extends AbstractControlador<Contrato>{
    public ContratoControlador() {
        super(Contrato.class);
    }
    
    public List<Contrato> buscarXEmpleado(Empleado empleado) {
        String jpql = "SELECT a FROM Contrato a WHERE a.empleado = :empleado";
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("empleado", empleado);
        return this.getDao().buscar(jpql, parametros);
    }
    
    public List<Contrato> buscarXContratoVigente(Empleado empleado, Boolean vigente) {
        String jpql = "SELECT a FROM Contrato a WHERE a.empleado = :empleado AND a.vigente = :vigente" ;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("empleado", empleado);
        parametros.put("vigente", vigente);
        return this.getDao().buscar(jpql, parametros);
    }
}
