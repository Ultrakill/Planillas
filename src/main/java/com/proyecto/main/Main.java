/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.main;

import com.proyecto.beans.Empleado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Documentos
 */
public class Main {
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        
        EntityManager em;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEFAULT_PU");
        em = emf.createEntityManager();
        
        em.getTransaction().begin();
        empleado.setNombre("JUAN");
        empleado.setApellidoMaterno("PEREZ");
        empleado.setApellidoPaterno("PRUEBA");
        em.persist(empleado);

        em.getTransaction().commit();
    }
}
