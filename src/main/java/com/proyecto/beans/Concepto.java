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


    @Column(name="eliminado")
    @Basic
    private Boolean eliminado;


    @Column(name="descripcion")
    @Basic
    private String descripcion;


    @Column(name="afecta_plame")
    @Basic
    private Boolean afectaPlame;


    @Column(name="id",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name="nombre")
    @Basic
    private String nombre;


    @Column(name="orden")
    @Basic
    private Integer orden;


    @Column(name="abreviatura")
    @Basic
    private String abreviatura;


    @Column(name="columna_boleta")
    @Basic
    private String columnaBoleta;


    @Column(name="tipo")
    @Basic
    private String tipo;


    @ManyToOne(targetEntity=Concepto.class)
    @JoinColumn(name="concepto_asociado",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Concepto conceptoAsociado;


    @ManyToOne(targetEntity=Movimiento.class)
    @JoinColumn(name="movimiento_id",referencedColumnName="codigo",insertable=true,nullable=true,unique=false,updatable=true)
    private Movimiento movimiento;


    @Column(name="afecta_rem_comp")
    @Basic
    private Boolean afectaRemComp;

    public Concepto(){

    }


   public Collection<ReservaConcepto> getReservaConceptoList() {
        return this.reservaConceptoList;
    }


  public void setReservaConceptoList (Collection<ReservaConcepto> reservaConceptoList) {
        this.reservaConceptoList = reservaConceptoList;
    }



    public Boolean isEliminado() {
        return this.eliminado;
    }


  public void setEliminado (Boolean eliminado) {
        this.eliminado = eliminado;
    }



   public String getDescripcion() {
        return this.descripcion;
    }


  public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }



    public Boolean isAfectaPlame() {
        return this.afectaPlame;
    }


  public void setAfectaPlame (Boolean afectaPlame) {
        this.afectaPlame = afectaPlame;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getNombre() {
        return this.nombre;
    }


  public void setNombre (String nombre) {
        this.nombre = nombre;
    }



   public Integer getOrden() {
        return this.orden;
    }


  public void setOrden (Integer orden) {
        this.orden = orden;
    }



   public String getAbreviatura() {
        return this.abreviatura;
    }


  public void setAbreviatura (String abreviatura) {
        this.abreviatura = abreviatura;
    }



   public String getColumnaBoleta() {
        return this.columnaBoleta;
    }


  public void setColumnaBoleta (String columnaBoleta) {
        this.columnaBoleta = columnaBoleta;
    }



   public String getTipo() {
        return this.tipo;
    }


  public void setTipo (String tipo) {
        this.tipo = tipo;
    }



   public Concepto getConceptoAsociado() {
        return this.conceptoAsociado;
    }


  public void setConceptoAsociado (Concepto conceptoAsociado) {
        this.conceptoAsociado = conceptoAsociado;
    }



   public Movimiento getMovimiento() {
        return this.movimiento;
    }


  public void setMovimiento (Movimiento movimiento) {
        this.movimiento = movimiento;
    }



    public Boolean getAfectaRemComp() {
        return this.afectaRemComp;
    }


  public void setAfectaRemComp (Boolean afectaRemComp) {
        this.afectaRemComp = afectaRemComp;
    }

}

