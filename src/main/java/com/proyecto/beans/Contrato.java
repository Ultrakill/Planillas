package com.proyecto.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
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
@Table(name="contrato")
public  class Contrato implements Serializable {


    @OneToMany(targetEntity=PeriodoTipoTrabajador.class,mappedBy="contrato")
    private List<PeriodoTipoTrabajador> periodoTipoTrabajadorList;


    @Column(name="vida",nullable=false)
    @Basic
    private Boolean vida;


    @ManyToOne(targetEntity=Empleado.class)
    @JoinColumn(name="empleado_id",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Empleado empleado;


    @Column(name="fecha_fin",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaFin;


    @Column(name="asignacion_fam",nullable=false)
    @Basic
    private Boolean asignacionFam;


    @ManyToOne(targetEntity=TipoContrato.class)
    @JoinColumn(name="tipo_contrato_id",referencedColumnName="codigo",insertable=true,nullable=true,unique=false,updatable=true)
    private TipoContrato tipoContrato;


    @OneToMany(targetEntity=PeriodoRegimenSalud.class,mappedBy="contrato")
    private List<PeriodoRegimenSalud> periodoRegimenSaludList;


    @Column(name="sueldo_base",nullable=false)
    @Basic
    private Double sueldoBase;


    @OneToMany(targetEntity=DetallePlanilla.class,mappedBy="contrato")
    private Collection<DetallePlanilla> detallePlanilla;


    @OneToMany(targetEntity=PeriodoRegimenPension.class,mappedBy="contrato")
    private List<PeriodoRegimenPension> periodoRegimenPensionList;


    @Column(name="id",unique=true,nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(optional=false,targetEntity=TipoPago.class)
    @JoinColumn(name="tipo_pago_id",referencedColumnName="codigo",insertable=true,nullable=false,unique=false,updatable=true)
    private TipoPago tipoPago;


    @Column(name="periodicidad",nullable=false)
    @Basic
    private String periodicidad;


    @ManyToOne(targetEntity=MotivoBajaTrabajador.class)
    @JoinColumn(name="motivo_baja_id",referencedColumnName="codigo",insertable=true,nullable=true,unique=false,updatable=true)
    private MotivoBajaTrabajador motivoBajaTrabajador;


    @Column(name="fecha_inicio",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date fechaInicio;


    @Column(name="vigente",nullable=false)
    @Basic
    private Boolean vigente;

    public Contrato(){

    }


   public List<PeriodoTipoTrabajador> getPeriodoTipoTrabajadorList() {
        return this.periodoTipoTrabajadorList;
    }


  public void setPeriodoTipoTrabajadorList (List<PeriodoTipoTrabajador> periodoTipoTrabajadorList) {
        this.periodoTipoTrabajadorList = periodoTipoTrabajadorList;
    }



    public Boolean isVida() {
        return this.vida;
    }


  public void setVida (Boolean vida) {
        this.vida = vida;
    }



   public Empleado getEmpleado() {
        return this.empleado;
    }


  public void setEmpleado (Empleado empleado) {
        this.empleado = empleado;
    }



   public Date getFechaFin() {
        return this.fechaFin;
    }


  public void setFechaFin (Date fechaFin) {
        this.fechaFin = fechaFin;
    }



    public Boolean isAsignacionFam() {
        return this.asignacionFam;
    }


  public void setAsignacionFam (Boolean asignacionFam) {
        this.asignacionFam = asignacionFam;
    }



   public TipoContrato getTipoContrato() {
        return this.tipoContrato;
    }


  public void setTipoContrato (TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }



   public List<PeriodoRegimenSalud> getPeriodoRegimenSaludList() {
        return this.periodoRegimenSaludList;
    }


  public void setPeriodoRegimenSaludList (List<PeriodoRegimenSalud> periodoRegimenSaludList) {
        this.periodoRegimenSaludList = periodoRegimenSaludList;
    }



   public Double getSueldoBase() {
        return this.sueldoBase;
    }


  public void setSueldoBase (Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }



   public Collection<DetallePlanilla> getDetallePlanilla() {
        return this.detallePlanilla;
    }


  public void setDetallePlanilla (Collection<DetallePlanilla> detallePlanilla) {
        this.detallePlanilla = detallePlanilla;
    }



   public List<PeriodoRegimenPension> getPeriodoRegimenPensionList() {
        return this.periodoRegimenPensionList;
    }


  public void setPeriodoRegimenPensionList (List<PeriodoRegimenPension> periodoRegimenPensionList) {
        this.periodoRegimenPensionList = periodoRegimenPensionList;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public TipoPago getTipoPago() {
        return this.tipoPago;
    }


  public void setTipoPago (TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }



   public String getPeriodicidad() {
        return this.periodicidad;
    }


  public void setPeriodicidad (String periodicidad) {
        this.periodicidad = periodicidad;
    }



   public MotivoBajaTrabajador getMotivoBajaTrabajador() {
        return this.motivoBajaTrabajador;
    }


  public void setMotivoBajaTrabajador (MotivoBajaTrabajador motivoBajaTrabajador) {
        this.motivoBajaTrabajador = motivoBajaTrabajador;
    }



   public Date getFechaInicio() {
        return this.fechaInicio;
    }


  public void setFechaInicio (Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }



    public Boolean getVigente() {
        return this.vigente;
    }


  public void setVigente (Boolean vigente) {
        this.vigente = vigente;
    }

}

