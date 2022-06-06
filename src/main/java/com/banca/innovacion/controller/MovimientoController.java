package com.banca.innovacion.controller;

import com.banca.innovacion.dto.MovimientoDto;
import com.banca.innovacion.model.Cuenta;
import com.banca.innovacion.model.Movimiento;
import com.banca.innovacion.services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class MovimientoController {

    @Autowired
    MovimientoService movimientoService;

    @PostMapping("/realizarmovimiento")
    public ResponseEntity<?> save(@RequestBody Movimiento movimiento){
        movimientoService.movimientoProcedure(movimiento);
        return new ResponseEntity("movimiento guardado", HttpStatus.CREATED);
    }

    @GetMapping("/listmovimientos")
    public ResponseEntity<List<Movimiento>> list(){
        List<Movimiento> list = movimientoService.findAll();
        return new ResponseEntity<List<Movimiento>>(list, HttpStatus.OK);
    }

    @GetMapping("/movimiento/{cuenta}")
    public ResponseEntity<Movimiento> getByNombre(@PathVariable("cuenta") Long cuenta){
        boolean producto = movimientoService.existCuenta(cuenta);
        return new ResponseEntity(producto, HttpStatus.OK);
    }

}
