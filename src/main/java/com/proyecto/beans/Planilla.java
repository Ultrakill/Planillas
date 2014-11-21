package com.proyecto.beans;

import java.io.Serializable;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="planilla")
public  class Planilla implements Serializable {


    @Column(name="fecha_final")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaFinal;


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="estado")
    @Basic
    private String estado;


    @Column(name="monto_essalud_vida")
    @Basic
    private Double montoEsSaludVida;


    @Column(name="monto_onp")
    @Basic
    private Double montoOnp;


    @Column(name="fecha_inicial")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaInicial;


    @Column(name="eliminado")
    @Basic
    private String eliminado;


    @Column(name="monto_asig_fam")
    @Basic
    private Double montoAsigFamiliar;


    @OneToMany(targetEntity=DetallePlanilla.class,mappedBy="planilla")
    private Collection<DetallePlanilla> detallePlanillaList;


    @Column(name="monto_essalud")
    @Basic
    private Double montoEsSalud;


    @Temporal(TemporalType.DATE)
    @Basic
    private Date periodo;


    @Column(name="fecha_pago")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaPago;


    @Column(name="tipo_planilla")
    @Basic
    private String tipoPlanilla;

    public Planilla(){

    }


   public Date getFechaFinal() {
        return this.fechaFinal;
    }


  public void setFechaFinal (Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getEstado() {
        return this.estado;
    }


  public void setEstado (String estado) {
        this.estado = estado;
    }



   public Double getMontoEsSaludVida() {
        return this.montoEsSaludVida;
    }


  public void setMontoEsSaludVida (Double montoEsSaludVida) {
        this.montoEsSaludVida = montoEsSaludVida;
    }



   public Double getMontoOnp() {
        return this.montoOnp;
    }


  public void setMontoOnp (Double montoOnp) {
        this.montoOnp = montoOnp;
    }



   public Date getFechaInicial() {
        return this.fechaInicial;
    }


  public void setFechaInicial (Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }



   public String getEliminado() {
        return this.eliminado;
    }


  public void setEliminado (String eliminado) {
        this.eliminado = eliminado;
    }



   public Double getMontoAsigFamiliar() {
        return this.montoAsigFamiliar;
    }


  public void setMontoAsigFamiliar (Double montoAsigFamiliar) {
        this.montoAsigFamiliar = montoAsigFamiliar;
    }



   public Collection<DetallePlanilla> getDetallePlanillaList() {
        return this.detallePlanillaList;
    }


  public void setDetallePlanillaList (Collection<DetallePlanilla> detallePlanillaList) {
        this.detallePlanillaList = detallePlanillaList;
    }



   public Double getMontoEsSalud() {
        return this.montoEsSalud;
    }


  public void setMontoEsSalud (Double montoEsSalud) {
        this.montoEsSalud = montoEsSalud;
    }



   public Date getPeriodo() {
        return this.periodo;
    }


  public void setPeriodo (Date periodo) {
        this.periodo = periodo;
    }



   public Date getFechaPago() {
        return this.fechaPago;
    }


  public void setFechaPago (Date fechaPago) {
        this.fechaPago = fechaPago;
    }



   public String getTipoPlanilla() {
        return this.tipoPlanilla;
    }


  public void setTipoPlanilla (String tipoPlanilla) {
        this.tipoPlanilla = tipoPlanilla;
    }

}

