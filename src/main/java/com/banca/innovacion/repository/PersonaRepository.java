package com.banca.innovacion.repository;

import com.banca.innovacion.model.Moneda;
import com.banca.innovacion.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {



}
