/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control;

import com.proyecto.beans.PeriodoRegimenSalud;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juvitec
 */
public class PeriodoRegimenSaludControlador extends AbstractControlador<PeriodoRegimenSalud>{
    public PeriodoRegimenSaludControlador(){
        super(PeriodoRegimenSalud.class);
    }
    
    public List<PeriodoRegimenSalud> buscarXContratoVigente(Boolean vigente) {
        String jpql = "SELECT a FROM PeriodoRegimenSalud a WHERE a.vigente = :vigente" ;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("vigente", vigente);
        return this.getDao().buscar(jpql, parametros);
    }
    
}
