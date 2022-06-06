package com.banca.innovacion.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "PERSONAS")
public class Persona {

    @Id
    @Column(name = "RUT",nullable = false, unique = true)
    private long rut;
    @OneToMany(mappedBy = "persona")
    private List<Cuenta> cuentas;


    public Persona() {
    }

    public Persona(long rut) {
        this.rut = rut;
    }



    public long getRut() {
        return rut;
    }

    public void setRut(long rut) {
        this.rut = rut;
    }
}
