package com.banca.innovacion.dto;

public class MovimientoDto {

    private long cdmovimiento;
    private long nmcuentaorigen;
    private long nmcuentadestino;
    private double ptmonto;

    public long getCdmovimiento() {
        return cdmovimiento;
    }

    public void setCdmovimiento(long cdmovimiento) {
        this.cdmovimiento = cdmovimiento;
    }

    public long getNmcuentaorigen() {
        return nmcuentaorigen;
    }

    public void setNmcuentaorigen(long nmcuentaorigen) {
        this.nmcuentaorigen = nmcuentaorigen;
    }

    public long getNmcuentadestino() {
        return nmcuentadestino;
    }

    public void setNmcuentadestino(long nmcuentadestino) {
        this.nmcuentadestino = nmcuentadestino;
    }

    public double getPtmonto() {
        return ptmonto;
    }

    public void setPtmonto(double ptmonto) {
        this.ptmonto = ptmonto;
    }
}
