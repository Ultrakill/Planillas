package com.proyecto.beans;

import java.io.Serializable;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_movimiento")
public  class TipoMovimiento implements Serializable {


    @Id
    private Long id1;


    @OneToMany(targetEntity=Movimiento.class,mappedBy="tipoMovimiento1")
    private Collection<Movimiento> movimiento1;


    @Basic
    private String attribute1;


    @Basic
    private String attribute2;


    @Basic
    private String attribute3;

    public TipoMovimiento(){

    }


   public Long getId1() {
        return this.id1;
    }


  public void setId1 (Long id1) {
        this.id1 = id1;
    }



   public Collection<Movimiento> getMovimiento1() {
        return this.movimiento1;
    }


  public void setMovimiento1 (Collection<Movimiento> movimiento1) {
        this.movimiento1 = movimiento1;
    }



   public String getAttribute1() {
        return this.attribute1;
    }


  public void setAttribute1 (String attribute1) {
        this.attribute1 = attribute1;
    }



   public String getAttribute2() {
        return this.attribute2;
    }


  public void setAttribute2 (String attribute2) {
        this.attribute2 = attribute2;
    }



   public String getAttribute3() {
        return this.attribute3;
    }


  public void setAttribute3 (String attribute3) {
        this.attribute3 = attribute3;
    }

}

