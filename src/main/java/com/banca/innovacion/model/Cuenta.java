package com.banca.innovacion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "CUENTAS")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NMCUENTA", nullable = false)
    private long nmcuenta;
    @Column(name = "RUT", nullable = false)
    private long rut;
    @Column(name = "CDMONEDA", nullable = false)
    private long cdmoneda;
    @Column(name = "PTSALDO")
    private Double ptsaldo;

    @ManyToOne
    @JoinColumn(name = "cdmoneda",insertable = false, updatable = false)
    private Moneda moneda;

    @ManyToOne
    @JoinColumn(name = "rut",insertable = false, updatable = false)
    private Persona persona;

    public Cuenta(long rut, long cdmoneda, Double ptsaldo) {
        this.rut = rut;
        this.cdmoneda = cdmoneda;
        this.ptsaldo = ptsaldo;
    }

    public Cuenta() {
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public long getNmcuenta() {
        return nmcuenta;
    }

    public void setNmcuenta(long nmcuenta) {
        this.nmcuenta = nmcuenta;
    }

    public long getRut() {
        return rut;
    }

    public void setRut(long rut) {
        this.rut = rut;
    }

    public long getCdmoneda() {
        return cdmoneda;
    }

    public void setCdmoneda(long cdmoneda) {
        this.cdmoneda = cdmoneda;
    }

    public Double getPtsaldo() {
        return ptsaldo;
    }

    public void setPtsaldo(Double ptsaldo) {
        this.ptsaldo = ptsaldo;
    }
}
