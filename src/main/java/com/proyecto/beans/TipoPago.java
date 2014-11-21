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
@Table(name="tipo_pago")
public  class TipoPago implements Serializable {


    @Basic
    private String nombre;


    @Column(name="codigo",nullable=false)
    @Id
    private String codigo;


    @OneToMany(targetEntity=Contrato.class,mappedBy="tipoPago")
    private Collection<Contrato> contratoList;

    public TipoPago(){

    }


   public String getNombre() {
        return this.nombre;
    }


  public void setNombre (String nombre) {
        this.nombre = nombre;
    }



   public String getCodigo() {
        return this.codigo;
    }


  public void setCodigo (String codigo) {
        this.codigo = codigo;
    }



   public Collection<Contrato> getContratoList() {
        return this.contratoList;
    }


  public void setContratoList (Collection<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

}

