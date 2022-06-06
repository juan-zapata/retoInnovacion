package com.banca.innovacion.controller;


import com.banca.innovacion.dto.CuentaDto;
import com.banca.innovacion.model.Cuenta;
import com.banca.innovacion.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class CuentaController {

    @Autowired
    CuentaService cuentaService;


    @PostMapping("/crearcuenta")
    public ResponseEntity<?> create(@RequestBody CuentaDto create){
        return new ResponseEntity<>(cuentaService.save(create), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Cuenta>> list(){
        List<Cuenta> list = cuentaService.findAll();
        return new ResponseEntity<List<Cuenta>>(list, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{cuenta}")
    public ResponseEntity<?> delete(@PathVariable("cuenta")Long cuenta){
        cuentaService.eliminarCuenta(cuenta);
        return new ResponseEntity("producto eliminado", HttpStatus.OK);
    }
}
