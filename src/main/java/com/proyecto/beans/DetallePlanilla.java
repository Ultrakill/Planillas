package com.proyecto.beans;

import java.io.Serializable;

import java.util.Collection;
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

@Entity
@Table(name="detalle_planilla")
public  class DetallePlanilla implements Serializable {


    @OneToMany(targetEntity=ReservaConcepto.class,mappedBy="detallePlanilla")
    private Collection<ReservaConcepto> reservaConceptoList;


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(targetEntity=Planilla.class)
    @JoinColumn(name="planilla_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Planilla planilla;


    @Column(name="eliminado")
    @Basic
    private String eliminado;


    @Column(name="dias_subsidiados")
    @Basic
    private Integer diasSubsidiados;


    @Column(name="dias_no_lab")
    @Basic
    private Integer diasNoLab;


    @Column(name="dias_lab")
    @Basic
    private Integer diasLab;


    @ManyToOne(targetEntity=Contrato.class)
    @JoinColumn(name="contratos_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Contrato contrato;


    @ManyToOne(targetEntity=PorcentajeAFP.class)
    @JoinColumn(name="porcentajeAFP_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private PorcentajeAFP porcentajeAFP;

    public DetallePlanilla(){

    }


   public Collection<ReservaConcepto> getReservaConceptoList() {
        return this.reservaConceptoList;
    }


  public void setReservaConceptoList (Collection<ReservaConcepto> reservaConceptoList) {
        this.reservaConceptoList = reservaConceptoList;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public Planilla getPlanilla() {
        return this.planilla;
    }


  public void setPlanilla (Planilla planilla) {
        this.planilla = planilla;
    }



   public String getEliminado() {
        return this.eliminado;
    }


  public void setEliminado (String eliminado) {
        this.eliminado = eliminado;
    }



   public Integer getDiasSubsidiados() {
        return this.diasSubsidiados;
    }


  public void setDiasSubsidiados (Integer diasSubsidiados) {
        this.diasSubsidiados = diasSubsidiados;
    }



   public Integer getDiasNoLab() {
        return this.diasNoLab;
    }


  public void setDiasNoLab (Integer diasNoLab) {
        this.diasNoLab = diasNoLab;
    }



   public Integer getDiasLab() {
        return this.diasLab;
    }


  public void setDiasLab (Integer diasLab) {
        this.diasLab = diasLab;
    }



   public Contrato getContrato() {
        return this.contrato;
    }


  public void setContrato (Contrato contrato) {
        this.contrato = contrato;
    }



   public PorcentajeAFP getPorcentajeAFP() {
        return this.porcentajeAFP;
    }


  public void setPorcentajeAFP (PorcentajeAFP porcentajeAFP) {
        this.porcentajeAFP = porcentajeAFP;
    }

}

