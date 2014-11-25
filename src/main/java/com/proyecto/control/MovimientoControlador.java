/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control;

import com.proyecto.beans.Movimiento;
import com.proyecto.beans.TipoMovimiento;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juvitec
 */
public class MovimientoControlador extends AbstractControlador<Movimiento>{
    public MovimientoControlador(){
        super(Movimiento.class);
    }
    
    public List<Movimiento> filtroTipoMovimiento(TipoMovimiento tipoMov){
        String jpql = "SELECT a FROM Movimiento a WHERE a.tipoMovimiento = :tipoMov";
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("tipoMov", tipoMov);
        return this.getDao().buscar(jpql, parametros);
    }
    
}
