/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.control;

import com.proyecto.beans.RegimenPensionario;
import java.util.List;

/**
 *
 * @author juvitec
 */
public class RegimenPensionarioControlador extends AbstractControlador<RegimenPensionario>{
    public RegimenPensionarioControlador(){
        super(RegimenPensionario.class);
    }
    
    public List<RegimenPensionario> buscarXFiltro() {
        String jpql = "SELECT a FROM RegimenPensionario a"
                + " WHERE a.codigo IN ('21','22','23','24','25')";
        
        return this.getDao().buscar(jpql);
    }
    
}
