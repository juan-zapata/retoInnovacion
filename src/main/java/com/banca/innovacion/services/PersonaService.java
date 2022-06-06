package com.banca.innovacion.services;

import com.banca.innovacion.model.Persona;
import com.banca.innovacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;
}
