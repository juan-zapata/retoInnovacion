package com.banca.innovacion.dto;

public class PersonaNaturalDto {

    private long rut;
    private String nombre;
    private String apellido;
    private String tipodocumento;
    private long nmdocumento;


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

    public long getNmdocumento() {
        return nmdocumento;
    }

    public void setNmdocumento(long nmdocumento) {
        this.nmdocumento = nmdocumento;
    }
}
