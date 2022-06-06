package com.banca.innovacion.controller;

import com.banca.innovacion.dto.PersonaJuridicaDto;
import com.banca.innovacion.dto.PersonaNaturalDto;
import com.banca.innovacion.model.Cuenta;
import com.banca.innovacion.model.PersonaJuridica;
import com.banca.innovacion.model.PersonaNatural;
import com.banca.innovacion.services.PersonaJuridicaService;
import com.banca.innovacion.services.PersonaNaturalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class PersonaController {


    @Autowired
    PersonaNaturalService personaNaturalService;
    @Autowired
    PersonaJuridicaService personaJuridicaService;


    @PostMapping("/almacenarpersonanatural")
    public ResponseEntity<?> create(@RequestBody PersonaNaturalDto personaDto){
        personaNaturalService.save(personaDto);
        return new ResponseEntity("Usuario añadido con exito", HttpStatus.OK);
    }

    @PostMapping("/almacenarpersonajuridica")
    public ResponseEntity<?> createPersonaJuridica(@RequestBody PersonaJuridicaDto personaDto){
        personaJuridicaService.save(personaDto);
        return new ResponseEntity(personaDto, HttpStatus.OK);
    }

    @GetMapping("/listpersonas")
    public ResponseEntity<List<PersonaNatural>> list(){
        List<PersonaNatural> list = personaNaturalService.findAll();
        return new ResponseEntity<List<PersonaNatural>>(list, HttpStatus.OK);
    }
}
