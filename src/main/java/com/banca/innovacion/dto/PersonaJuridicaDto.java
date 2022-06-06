package com.banca.innovacion.dto;

import java.util.Date;

public class PersonaJuridicaDto {

    private long rut;
    private String razonsocial;
    private Date fefundacion;

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

    public void setFefundacion(Date fefundacion) {
        this.fefundacion = fefundacion;
    }
}
