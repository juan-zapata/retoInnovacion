package com.banca.innovacion.dto;

public class CuentaDto {
    private long rut;
    private long cdmoneda;
    private Double ptsaldo;
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
