package com.proyecto.beans;

import java.io.Serializable;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="baja_trabajador")
public  class MotivoBajaTrabajador implements Serializable {


    @Column(name="nombre",nullable=false)
    @Basic
    private String nombre;


    @Column(name="codigo",nullable=false)
    @Id
    private String codigo;


    @Basic
    private String abreviatura;


    @OneToMany(targetEntity=Contrato.class,mappedBy="motivoBajaTrabajador")
    private Collection<Contrato> contratoList;

    public MotivoBajaTrabajador(){

    }


   public String getNombre() {
        return this.nombre;
    }


  public void setNombre (String nombre) {
        this.nombre = nombre;
    }



   public String getCodigo() {
        return this.codigo;
    }


  public void setCodigo (String codigo) {
        this.codigo = codigo;
    }



   public String getAbreviatura() {
        return this.abreviatura;
    }


  public void setAbreviatura (String abreviatura) {
        this.abreviatura = abreviatura;
    }



   public Collection<Contrato> getContratoList() {
        return this.contratoList;
    }


  public void setContratoList (Collection<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

}

