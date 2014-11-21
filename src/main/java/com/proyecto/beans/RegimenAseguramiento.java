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
@Table(name="regimen_aseguramiento")
public  class RegimenAseguramiento implements Serializable {


    @Column(name="nombre",nullable=false)
    @Basic
    private String nombre;


    @Column(name="codigo",nullable=false)
    @Id
    private String codigo;


    @Column(name="abreviatura",nullable=false)
    @Basic
    private String abreviatura;


    @OneToMany(targetEntity=PeriodoRegimenSalud.class,mappedBy="regimenAseguramiento")
    private Collection<PeriodoRegimenSalud> periodoRegimenSaludList;

    public RegimenAseguramiento(){

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



   public Collection<PeriodoRegimenSalud> getPeriodoRegimenSaludList() {
        return this.periodoRegimenSaludList;
    }


  public void setPeriodoRegimenSaludList (Collection<PeriodoRegimenSalud> periodoRegimenSaludList) {
        this.periodoRegimenSaludList = periodoRegimenSaludList;
    }

}

