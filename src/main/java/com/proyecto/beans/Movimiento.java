package com.proyecto.beans;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movimiento")
public  class Movimiento implements Serializable {


    @ManyToOne(targetEntity=TipoMovimiento.class)
    private TipoMovimiento tipoMovimiento1;


    @Id
    private Long id1;


    @Basic
    private String attribute1;


    @Basic
    private String attribute2;


    @Basic
    private String attribute3;

    public Movimiento(){

    }


   public TipoMovimiento getTipoMovimiento1() {
        return this.tipoMovimiento1;
    }


  public void setTipoMovimiento1 (TipoMovimiento tipoMovimiento1) {
        this.tipoMovimiento1 = tipoMovimiento1;
    }



   public Long getId1() {
        return this.id1;
    }


  public void setId1 (Long id1) {
        this.id1 = id1;
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

