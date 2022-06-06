package com.banca.innovacion.dto;

public class MonedaDto {

    private long idmoneda;
    private String dsnombre;
    private Double ptmontomax;

    public long getIdmoneda() {
        return idmoneda;
    }

    public void setIdmoneda(long idmoneda) {
        this.idmoneda = idmoneda;
    }

    public String getDsnombre() {
        return dsnombre;
    }

    public void setDsnombre(String dsnombre) {
        this.dsnombre = dsnombre;
    }

    public Double getPtmontomax() {
        return ptmontomax;
    }

    public void setPtmontomax(Double ptmontomax) {
        this.ptmontomax = ptmontomax;
    }
}
