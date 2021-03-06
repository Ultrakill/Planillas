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
@Table(name="periodo_regimen_pensionario")
public  class PeriodoRegimenPension implements Serializable {


    @Column(name="nombre")
    @Basic
    private String nombre;


    @Column(name="id")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="fecha_fin",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaFin;


    @ManyToOne(targetEntity=RegimenPensionario.class)
    @JoinColumn(name="regimen_pension_id",referencedColumnName="codigo",insertable=true,nullable=true,unique=false,updatable=true)
    private RegimenPensionario regimenPensionario;


    @Column(name="fecha_inicio",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaInicio;


    @ManyToOne(targetEntity=Contrato.class)
    @JoinColumn(name="contrato_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Contrato contrato;


    @Column(name="vigente")
    @Basic
    private Boolean vigente;

    public PeriodoRegimenPension(){

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



   public RegimenPensionario getRegimenPensionario() {
        return this.regimenPensionario;
    }


  public void setRegimenPensionario (RegimenPensionario regimenPensionario) {
        this.regimenPensionario = regimenPensionario;
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

