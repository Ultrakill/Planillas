package com.proyecto.beans;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserva_concepto")
public  class ReservaConcepto implements Serializable {


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(targetEntity=Concepto.class)
    @JoinColumn(name="concepto_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Concepto concepto;


    @Column(name="eliminado")
    @Basic
    private String eliminado;


    @ManyToOne(targetEntity=DetallePlanilla.class)
    @JoinColumn(name="detalle_planilla_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private DetallePlanilla detallePlanilla;


    @Column(name="monto")
    @Basic
    private Double monto;

    public ReservaConcepto(){

    }


   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public Concepto getConcepto() {
        return this.concepto;
    }


  public void setConcepto (Concepto concepto) {
        this.concepto = concepto;
    }



   public String getEliminado() {
        return this.eliminado;
    }


  public void setEliminado (String eliminado) {
        this.eliminado = eliminado;
    }



   public DetallePlanilla getDetallePlanilla() {
        return this.detallePlanilla;
    }


  public void setDetallePlanilla (DetallePlanilla detallePlanilla) {
        this.detallePlanilla = detallePlanilla;
    }



   public Double getMonto() {
        return this.monto;
    }


  public void setMonto (Double monto) {
        this.monto = monto;
    }

}

