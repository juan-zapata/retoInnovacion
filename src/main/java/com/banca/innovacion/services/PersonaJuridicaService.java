package com.banca.innovacion.services;

import com.banca.innovacion.dto.PersonaJuridicaDto;
import com.banca.innovacion.model.Persona;
import com.banca.innovacion.model.PersonaJuridica;
import com.banca.innovacion.model.PersonaNatural;
import com.banca.innovacion.repository.PersonaJuridicaRepository;
import com.banca.innovacion.repository.PersonaNaturalReposiroty;
import com.banca.innovacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaJuridicaService {

    @Autowired
    PersonaJuridicaRepository personaJuridicaRepository;
    @Autowired
    PersonaRepository personaRepository;

    public void  save(PersonaJuridicaDto personaJuridica){
        PersonaJuridica personaJu = new PersonaJuridica(personaJuridica.getRut(),personaJuridica.getRazonsocial(),personaJuridica.getFefundacion());
        Persona persona = new Persona();
        persona.setRut(personaJuridica.getRut());
        personaRepository.save(persona);
        personaJuridicaRepository.save(personaJu);
    }

    public List<PersonaJuridica> findAll(){
        return personaJuridicaRepository.findAll();
    }
}
