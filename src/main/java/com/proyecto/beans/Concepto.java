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
@Table(name="concepto")
public  class Concepto implements Serializable {


    @OneToMany(targetEntity=ReservaConcepto.class,mappedBy="concepto")
    private Collection<ReservaConcepto> reservaConceptoList;


    @Column(name="orden")
    @Basic
    private Integer orden;


    @Column(name="nombre")
    @Basic
    private String nombre;


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="columna_boleta")
    @Basic
    private String columnaBoleta;


    @Column(name="abreviatura")
    @Basic
    private String abreviatura;


    @Column(name="eliminado")
    @Basic
    private Boolean eliminado;


    @Column(name="tipo")
    @Basic
    private String tipo;


    @Column(name="descripcion")
    @Basic
    private String descripcion;


    @ManyToOne(targetEntity=Concepto.class)
    @JoinColumn(name="concepto_asociado",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Concepto conceptoAsociado;


    @Column(name="afecta_rem_comp")
    @Basic
    private Boolean afectaRemComp;


    @Column(name="afecta_plame")
    @Basic
    private Boolean afectaPlame;

    public Concepto(){

    }


   public Collection<ReservaConcepto> getReservaConceptoList() {
        return this.reservaConceptoList;
    }


  public void setReservaConceptoList (Collection<ReservaConcepto> reservaConceptoList) {
        this.reservaConceptoList = reservaConceptoList;
    }



   public Integer getOrden() {
        return this.orden;
    }


  public void setOrden (Integer orden) {
        this.orden = orden;
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



   public String getColumnaBoleta() {
        return this.columnaBoleta;
    }


  public void setColumnaBoleta (String columnaBoleta) {
        this.columnaBoleta = columnaBoleta;
    }



   public String getAbreviatura() {
        return this.abreviatura;
    }


  public void setAbreviatura (String abreviatura) {
        this.abreviatura = abreviatura;
    }



    public Boolean isEliminado() {
        return this.eliminado;
    }


  public void setEliminado (Boolean eliminado) {
        this.eliminado = eliminado;
    }



   public String getTipo() {
        return this.tipo;
    }


  public void setTipo (String tipo) {
        this.tipo = tipo;
    }



   public String getDescripcion() {
        return this.descripcion;
    }


  public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }



   public Concepto getConceptoAsociado() {
        return this.conceptoAsociado;
    }


  public void setConceptoAsociado (Concepto conceptoAsociado) {
        this.conceptoAsociado = conceptoAsociado;
    }



    public Boolean isAfectaRemComp() {
        return this.afectaRemComp;
    }


  public void setAfectaRemComp (Boolean afectaRemComp) {
        this.afectaRemComp = afectaRemComp;
    }



    public Boolean isAfectaPlame() {
        return this.afectaPlame;
    }


  public void setAfectaPlame (Boolean afectaPlame) {
        this.afectaPlame = afectaPlame;
    }

}

