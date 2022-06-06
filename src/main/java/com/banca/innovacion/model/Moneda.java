package com.banca.innovacion.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MONEDAS")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDMONEDA",nullable = false)
    private long idmoneda;
    @Column(name = "DSNOMBRE",nullable = false, unique = true)
    private String dsnombre;
    @Column(name = "PTMONTOMAX",nullable = false)
    private Double ptmontomax;
    @OneToMany(mappedBy = "moneda")
    private List<Cuenta> cuentas;


    public Moneda() {
    }

    public Moneda( String dsnombre, Double ptmontomax) {
        this.dsnombre = dsnombre;
        this.ptmontomax = ptmontomax;
    }



    public Double getPtmontomax() {
        return ptmontomax;
    }

    public void setPtmontomax(Double ptmontomax) {
        this.ptmontomax = ptmontomax;
    }



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
}
