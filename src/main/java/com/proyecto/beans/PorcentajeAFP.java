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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="porcentaje_AFP")
public  class PorcentajeAFP implements Serializable {


    @Column(name="fondo_pension")
    @Basic
    private Double fondoPension;


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="seguro_invalidez")
    @Basic
    private Double seguroInvalidez;


    @Column(name="tope_prima")
    @Basic
    private Double topePrima;


    @Column(name="comision_rem_flujo")
    @Basic
    private Double comisionRemFlujo;


    @OneToMany(targetEntity=DetallePlanilla.class,mappedBy="porcentajeAFP")
    private Collection<DetallePlanilla> detallePlanillaList;


    @Column(name="periodo")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date periodo;


    @ManyToOne(targetEntity=RegimenPensionario.class)
    @JoinColumn(name="regimen_pensionario_id",referencedColumnName="codigo",insertable=true,nullable=true,unique=false,updatable=true)
    private RegimenPensionario regimenPensionario;


    @Column(name="comision_rem_mixta")
    @Basic
    private Double comisionRemMixta;

    public PorcentajeAFP(){

    }


   public Double getFondoPension() {
        return this.fondoPension;
    }


  public void setFondoPension (Double fondoPension) {
        this.fondoPension = fondoPension;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public Double getSeguroInvalidez() {
        return this.seguroInvalidez;
    }


  public void setSeguroInvalidez (Double seguroInvalidez) {
        this.seguroInvalidez = seguroInvalidez;
    }



   public Double getTopePrima() {
        return this.topePrima;
    }


  public void setTopePrima (Double topePrima) {
        this.topePrima = topePrima;
    }



   public Double getComisionRemFlujo() {
        return this.comisionRemFlujo;
    }


  public void setComisionRemFlujo (Double comisionRemFlujo) {
        this.comisionRemFlujo = comisionRemFlujo;
    }



   public Collection<DetallePlanilla> getDetallePlanillaList() {
        return this.detallePlanillaList;
    }


  public void setDetallePlanillaList (Collection<DetallePlanilla> detallePlanillaList) {
        this.detallePlanillaList = detallePlanillaList;
    }



   public Date getPeriodo() {
        return this.periodo;
    }


  public void setPeriodo (Date periodo) {
        this.periodo = periodo;
    }



   public RegimenPensionario getRegimenPensionario() {
        return this.regimenPensionario;
    }


  public void setRegimenPensionario (RegimenPensionario regimenPensionario) {
        this.regimenPensionario = regimenPensionario;
    }



   public Double getComisionRemMixta() {
        return this.comisionRemMixta;
    }


  public void setComisionRemMixta (Double comisionRemMixta) {
        this.comisionRemMixta = comisionRemMixta;
    }

}

