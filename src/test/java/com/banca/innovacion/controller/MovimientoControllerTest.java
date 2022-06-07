package com.banca.innovacion.controller;

import com.banca.innovacion.model.Movimiento;
import com.banca.innovacion.services.MovimientoService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
class MovimientoControllerTest {

    @InjectMocks
    MovimientoController movimientoController;

    @Mock
    MovimientoService movimientoService;


    @Test
    void save() {
        Movimiento movimiento = mock(Movimiento.class);
        doNothing().when(movimientoService).movimientoProcedure(any(Movimiento.class));
        ResponseEntity<?> responseEntity = movimientoController.save(movimiento);
        Assert.assertEquals("movimiento guardado", responseEntity.getBody());
    }

    @Test
    void list() {
        when(movimientoService.findAll()).thenReturn(new ArrayList<Movimiento>());
        ResponseEntity<?> responseEntity = movimientoController.list();
        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    void getByNombre() {
        when(movimientoService.existCuenta(any(Long.class))).thenReturn(true);
        ResponseEntity<Boolean> responseEntity = movimientoController.getByNombre(any(Long.class));
        Assert.assertTrue(responseEntity.getBody());
    }
}