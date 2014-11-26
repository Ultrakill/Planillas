/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control;

import com.proyecto.beans.Contrato;
import com.proyecto.beans.PeriodoRegimenPension;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juvitec
 */
public class PeriodoRegimenPensionControlador extends AbstractControlador<PeriodoRegimenPension>{
    public PeriodoRegimenPensionControlador(){
        super(PeriodoRegimenPension.class);
    }
    
    public List<PeriodoRegimenPension> buscarXContratoVigente(Boolean vigente) {
        String jpql = "SELECT a FROM PeriodoRegimenPension a WHERE a.vigente = :vigente" ;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("vigente", vigente);
        return this.getDao().buscar(jpql, parametros);
    }
    
    public List<PeriodoRegimenPension> buscarXContrato(Contrato contrato) {
        String jpql = "SELECT a FROM PeriodoRegimenPension a WHERE a.contrato = :contrato" ;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("contrato", contrato);
        return this.getDao().buscar(jpql, parametros);
    }
}
