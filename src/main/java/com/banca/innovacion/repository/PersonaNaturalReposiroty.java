package com.banca.innovacion.repository;

import com.banca.innovacion.model.PersonaNatural;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaNaturalReposiroty extends JpaRepository<PersonaNatural, Long> {
}
