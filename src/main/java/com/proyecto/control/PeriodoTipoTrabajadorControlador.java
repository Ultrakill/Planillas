/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control;

import com.proyecto.beans.PeriodoTipoTrabajador;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juvitec
 */
public class PeriodoTipoTrabajadorControlador extends AbstractControlador<PeriodoTipoTrabajador>{
    public PeriodoTipoTrabajadorControlador(){
        super(PeriodoTipoTrabajador.class);
    }
    
    public List<PeriodoTipoTrabajador> buscarXContratoVigente(Boolean vigente) {
        String jpql = "SELECT a FROM PeriodoTipoTrabajador a WHERE a.vigente = :vigente" ;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("vigente", vigente);
        return this.getDao().buscar(jpql, parametros);
    }
    
}
