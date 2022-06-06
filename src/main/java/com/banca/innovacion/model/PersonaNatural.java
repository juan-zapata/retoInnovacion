package com.banca.innovacion.model;

import javax.persistence.*;


@Entity
@Table(name = "PERSONAS_NATURALES")
public class PersonaNatural {

    @Id
    @Column(name = "RUT",nullable = false)
    private long rut;
    @Column(name = "NOMBRE",nullable = false)
    private String nombre;
    @Column(name = "APELLIDO",nullable = false)
    private String apellido;
    @Column(name = "TIPODOCUMENTO")
    private String tipodocumento;
    @Column(name = "NUMDOCUMENTO")
    private long numdocumento;

    public PersonaNatural(){}
    public PersonaNatural(long rut, String nombre, String apellido, String tipodocumento, long numdocumento) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipodocumento = tipodocumento;
        this.numdocumento = numdocumento;
    }

    public long getRut() {
        return rut;
    }

    public void setRut(long rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public long getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(long numdocumento) {
        this.numdocumento = numdocumento;
    }
}
