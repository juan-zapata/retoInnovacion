package com.banca.innovacion.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PERSONAS_JURIDICAS")
public class PersonaJuridica {

    @Id
    @Column(name = "RUT",nullable = false)
    private long rut;
    @Column(name = "RAZON_SOCIAL",nullable = false)
    private String razonsocial;
    @Column(name = "FEFUNDACION")
    private Date fefundacion;

    public PersonaJuridica(long rut, String razonsocial, Date fefundacion) {
        this.rut = rut;
        this.razonsocial = razonsocial;
        this.fefundacion = fefundacion;
    }

    public PersonaJuridica() {

    }

    public long getRut() {
        return rut;
    }

    public void setRut(long rut) {
        this.rut = rut;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public Date getFefundacion() {
        return fefundacion;
    }

    public void setFefundacion(Date fefunfacion) {
        this.fefundacion = fefunfacion;
    }
}
