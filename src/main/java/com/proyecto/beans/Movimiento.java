package com.proyecto.beans;

import java.io.Serializable;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movimiento")
public  class Movimiento implements Serializable {


    @Column(name="codigo",nullable=false)
    @Id
    private String codigo;


    @ManyToOne(targetEntity=TipoMovimiento.class)
    @JoinColumn(name="tipo_movimiento_id",referencedColumnName="codigo",insertable=true,nullable=true,unique=false,updatable=true)
    private TipoMovimiento tipoMovimiento;


    @Column(name="afecta_rentaquinta_trab")
    @Basic
    private Boolean afectaRentaQuintaTrab;


    @Column(name="afecta_snp_trab")
    @Basic
    private Boolean afectaSnpTrab;


    @Column(name="afecta_sctr_empl")
    @Basic
    private Boolean afectaSctrEmpl;


    @OneToMany(targetEntity=Concepto.class,mappedBy="movimiento")
    private Collection<Concepto> conceptoList;


    @Column(name="descripcion")
    @Basic
    private String descripcion;


    @Column(name="afecta_essaludpens_pens")
    @Basic
    private Boolean afectaEsSaludPensPens;


    @Column(name="afecta_senati_empl")
    @Basic
    private Boolean afectaSenatiEmpl;


    @Column(name="afecta_spp_trab")
    @Basic
    private Boolean afectaSppTrab;


    @Column(name="afecta_essalud_trab_empl")
    @Basic
    private Boolean afectaEsSaludTrabEmpl;

    public Movimiento(){

    }


   public String getCodigo() {
        return this.codigo;
    }


  public void setCodigo (String codigo) {
        this.codigo = codigo;
    }



   public TipoMovimiento getTipoMovimiento() {
        return this.tipoMovimiento;
    }


  public void setTipoMovimiento (TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }



    public Boolean isAfectaRentaQuintaTrab() {
        return this.afectaRentaQuintaTrab;
    }


  public void setAfectaRentaQuintaTrab (Boolean afectaRentaQuintaTrab) {
        this.afectaRentaQuintaTrab = afectaRentaQuintaTrab;
    }



    public Boolean isAfectaSnpTrab() {
        return this.afectaSnpTrab;
    }


  public void setAfectaSnpTrab (Boolean afectaSnpTrab) {
        this.afectaSnpTrab = afectaSnpTrab;
    }



    public Boolean isAfectaSctrEmpl() {
        return this.afectaSctrEmpl;
    }


  public void setAfectaSctrEmpl (Boolean afectaSctrEmpl) {
        this.afectaSctrEmpl = afectaSctrEmpl;
    }



   public Collection<Concepto> getConceptoList() {
        return this.conceptoList;
    }


  public void setConceptoList (Collection<Concepto> conceptoList) {
        this.conceptoList = conceptoList;
    }



   public String getDescripcion() {
        return this.descripcion;
    }


  public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }



    public Boolean isAfectaEsSaludPensPens() {
        return this.afectaEsSaludPensPens;
    }


  public void setAfectaEsSaludPensPens (Boolean afectaEsSaludPensPens) {
        this.afectaEsSaludPensPens = afectaEsSaludPensPens;
    }



    public Boolean isAfectaSenatiEmpl() {
        return this.afectaSenatiEmpl;
    }


  public void setAfectaSenatiEmpl (Boolean afectaSenatiEmpl) {
        this.afectaSenatiEmpl = afectaSenatiEmpl;
    }



    public Boolean isAfectaSppTrab() {
        return this.afectaSppTrab;
    }


  public void setAfectaSppTrab (Boolean afectaSppTrab) {
        this.afectaSppTrab = afectaSppTrab;
    }



    public Boolean isAfectaEsSaludTrabEmpl() {
        return this.afectaEsSaludTrabEmpl;
    }


  public void setAfectaEsSaludTrabEmpl (Boolean afectaEsSaludTrabEmpl) {
        this.afectaEsSaludTrabEmpl = afectaEsSaludTrabEmpl;
    }

    @Override
    public String toString() {
        return descripcion;
    } 

}

