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
@Table(name="tipo_movimiento")
public  class TipoMovimiento implements Serializable {


    @Column(name="codigo",nullable=false)
    @Id
    private String codigo;


    @Column(name="descripcion")
    @Basic
    private String descripcion;


    @OneToMany(targetEntity=Movimiento.class,mappedBy="tipoMovimiento")
    private Collection<Movimiento> movimientoList;

    public TipoMovimiento(){

    }


   public String getCodigo() {
        return this.codigo;
    }


  public void setCodigo (String codigo) {
        this.codigo = codigo;
    }



   public String getDescripcion() {
        return this.descripcion;
    }


  public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }



   public Collection<Movimiento> getMovimientoList() {
        return this.movimientoList;
    }


  public void setMovimientoList (Collection<Movimiento> movimientoList) {
        this.movimientoList = movimientoList;
    }

    @Override
    public String toString() {
        return descripcion;
    }
  

}

