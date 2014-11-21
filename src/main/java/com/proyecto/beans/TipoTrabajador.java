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
@Table(name="tipo_trabajador")
public  class TipoTrabajador implements Serializable {


    @OneToMany(targetEntity=PeriodoTipoTrabajador.class,mappedBy="tipoTrabajador")
    private Collection<PeriodoTipoTrabajador> periodoTipoTrabajadorList;


    @Column(name="codigo",nullable=false)
    @Id
    private String codigo;


    @Column(name="abreviatura")
    @Basic
    private String abreviatura;


    @Column(name="sector_privado",nullable=false)
    @Basic
    private String sectorPrivado;


    @Column(name="otra_entidad",nullable=false)
    @Basic
    private String otraEntidad;


    @Column(name="descripcion",nullable=false)
    @Basic
    private String descripcion;


    @Column(name="sector_publico",nullable=false)
    @Basic
    private String sectorPublico;

    public TipoTrabajador(){

    }


   public Collection<PeriodoTipoTrabajador> getPeriodoTipoTrabajadorList() {
        return this.periodoTipoTrabajadorList;
    }


  public void setPeriodoTipoTrabajadorList (Collection<PeriodoTipoTrabajador> periodoTipoTrabajadorList) {
        this.periodoTipoTrabajadorList = periodoTipoTrabajadorList;
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



   public String getSectorPrivado() {
        return this.sectorPrivado;
    }


  public void setSectorPrivado (String sectorPrivado) {
        this.sectorPrivado = sectorPrivado;
    }



   public String getOtraEntidad() {
        return this.otraEntidad;
    }


  public void setOtraEntidad (String otraEntidad) {
        this.otraEntidad = otraEntidad;
    }



   public String getDescripcion() {
        return this.descripcion;
    }


  public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }



   public String getSectorPublico() {
        return this.sectorPublico;
    }


  public void setSectorPublico (String sectorPublico) {
        this.sectorPublico = sectorPublico;
    }

}

