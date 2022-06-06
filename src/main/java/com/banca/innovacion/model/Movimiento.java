package com.banca.innovacion.model;

import javax.persistence.*;

@Entity
@Table(name = "MOVIMIENTOS")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDMOVIMIENTO",nullable = false)
    private long cdmovimiento;
    @Column(name = "NMCUENTA_ORIGEN",nullable = false)
    private long nmcuentaOrigen;
    @Column(name = "NMCUENTA_DESTINO",nullable = false)
    private long nmcuentaDestino;
    @Column(name = "PTMONTO")
    private Double ptmonto;


    public Movimiento(long nmcuenta_origen, long nmcuenta_destino, Double ptmonto) {
        this.nmcuentaOrigen = nmcuenta_origen;
        this.nmcuentaDestino = nmcuenta_destino;
        this.ptmonto = ptmonto;
    }

    public Movimiento() {

    }


    public long getCdmovimiento() {
        return cdmovimiento;
    }

    public void setCdmovimiento(long cdmovimiento) {
        this.cdmovimiento = cdmovimiento;
    }

    public long getNmcuentaOrigen() {
        return nmcuentaOrigen;
    }

    public void setNmcuentaOrigen(long nmcuenta_origen) {
        this.nmcuentaOrigen = nmcuenta_origen;
    }

    public long getNmcuentaDestino() {
        return nmcuentaDestino;
    }

    public void setNmcuentaDestino(long nmcuenta_destino) {
        this.nmcuentaDestino = nmcuenta_destino;
    }

    public Double getPtmonto() {
        return ptmonto;
    }

    public void setPtmonto(Double ptmonto) {
        this.ptmonto = ptmonto;
    }

}
