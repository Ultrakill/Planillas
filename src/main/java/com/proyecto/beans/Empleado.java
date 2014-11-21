package com.proyecto.beans;

import java.io.Serializable;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public  class Empleado implements Serializable {


    @Column(name="nombre")
    @Basic
    private String nombre;


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="apellido_materno")
    @Basic
    private String apellidoMaterno;


    @Column(name="apellido_paterno")
    @Basic
    private String apellidoPaterno;


    @OneToMany(targetEntity=Contrato.class,mappedBy="empleado")
    private Collection<Contrato> contrato;

    public Empleado(){

    }


   public String getNombre() {
        return this.nombre;
    }


  public void setNombre (String nombre) {
        this.nombre = nombre;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }


  public void setApellidoMaterno (String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }



   public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }


  public void setApellidoPaterno (String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }



   public Collection<Contrato> getContrato() {
        return this.contrato;
    }


  public void setContrato (Collection<Contrato> contrato) {
        this.contrato = contrato;
    }

}

