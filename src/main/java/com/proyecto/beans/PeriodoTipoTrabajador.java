package com.proyecto.beans;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="periodo_tipo_trabajador")
public  class PeriodoTipoTrabajador implements Serializable {


    @ManyToOne(targetEntity=TipoTrabajador.class)
    @JoinColumn(name="tipo_trabajador_id",referencedColumnName="codigo",insertable=true,nullable=true,unique=false,updatable=true)
    private TipoTrabajador tipoTrabajador;


    @Column(name="nombre",nullable=false)
    @Basic
    private String nombre;


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="fecha_fin",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaFin;


    @Column(name="fecha_inicio",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaInicio;


    @ManyToOne(targetEntity=Contrato.class)
    @JoinColumn(name="contrato_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Contrato contrato;


    @Column(name="vigente",nullable=false)
    @Basic
    private Boolean vigente;

    public PeriodoTipoTrabajador(){

    }


   public TipoTrabajador getTipoTrabajador() {
        return this.tipoTrabajador;
    }


  public void setTipoTrabajador (TipoTrabajador tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
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



   public Date getFechaFin() {
        return this.fechaFin;
    }


  public void setFechaFin (Date fechaFin) {
        this.fechaFin = fechaFin;
    }



   public Date getFechaInicio() {
        return this.fechaInicio;
    }


  public void setFechaInicio (Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }



   public Contrato getContrato() {
        return this.contrato;
    }


  public void setContrato (Contrato contrato) {
        this.contrato = contrato;
    }



    public Boolean isVigente() {
        return this.vigente;
    }


  public void setVigente (Boolean vigente) {
        this.vigente = vigente;
    }

}

