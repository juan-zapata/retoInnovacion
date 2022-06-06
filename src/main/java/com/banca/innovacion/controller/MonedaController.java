package com.banca.innovacion.controller;


import com.banca.innovacion.dto.CuentaDto;
import com.banca.innovacion.dto.MonedaDto;
import com.banca.innovacion.services.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banco")
public class MonedaController {


    @Autowired
    MonedaService monedaService;

    @PostMapping("/crearmoneda")
    public ResponseEntity<?> create(@RequestBody MonedaDto moneda){
        monedaService.save(moneda);
        return new ResponseEntity("Moneda Creada", HttpStatus.OK);
    }
}
