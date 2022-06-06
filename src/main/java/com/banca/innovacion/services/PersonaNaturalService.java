package com.banca.innovacion.services;


import com.banca.innovacion.dto.PersonaNaturalDto;
import com.banca.innovacion.model.Persona;
import com.banca.innovacion.model.PersonaNatural;
import com.banca.innovacion.repository.PersonaNaturalReposiroty;
import com.banca.innovacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaNaturalService {

    @Autowired
    PersonaNaturalReposiroty personaNaturalReposiroty;
    @Autowired
    PersonaRepository personaRepository;

    public void  save(PersonaNaturalDto personaNatural){
        PersonaNatural personaNa = new PersonaNatural(personaNatural.getRut(),personaNatural.getNombre(),personaNatural.getApellido(),personaNatural.getTipodocumento(),personaNatural.getNmdocumento());
        Persona persona = new Persona();
        persona.setRut(personaNatural.getRut());
        personaRepository.save(persona);
        personaNaturalReposiroty.save(personaNa);
    }

    public List<PersonaNatural> findAll(){
        return personaNaturalReposiroty.findAll();
    }
}
