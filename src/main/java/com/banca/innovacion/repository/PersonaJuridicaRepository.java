package com.banca.innovacion.repository;

import com.banca.innovacion.model.PersonaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaJuridicaRepository extends JpaRepository<PersonaJuridica, Long> {
}
