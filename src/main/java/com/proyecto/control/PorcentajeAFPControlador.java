/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control;

import com.proyecto.beans.PorcentajeAFP;
import com.proyecto.vista.MantenimientoPorcentajeAFP;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juvitec
 */
public class PorcentajeAFPControlador extends AbstractControlador<PorcentajeAFP>{
    
    public PorcentajeAFPControlador(){
        super(PorcentajeAFP.class);
    }
    
    public List<PorcentajeAFP> buscarXPeriodo(Date periodo) {
        String jpql = "SELECT a FROM PorcentajeAFP a"
                + " WHERE a.periodo =:periodo";
        Map<String, Object> variable = new HashMap<String, Object>();
        variable.put("periodo", periodo);
        return this.getDao().buscar(jpql,variable);
    }
    
}
