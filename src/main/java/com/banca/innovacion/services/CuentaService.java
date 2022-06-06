package com.banca.innovacion.services;


import com.banca.innovacion.dto.CuentaDto;
import com.banca.innovacion.model.Cuenta;
import com.banca.innovacion.repository.CuentaRepository;

import io.github.jhipster.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class CuentaService extends QueryService<Cuenta> {

    @Autowired
    CuentaRepository cuentaRepository;

    @Autowired
    MovimientoService movimientoService;


    public List<Cuenta> findAll(){
        return cuentaRepository.findAll();
    }

    public Cuenta save(CuentaDto create){
        Cuenta crear = new Cuenta(create.getRut(),create.getCdmoneda(),create.getPtsaldo());
        System.out.println(create.getRut());
        return cuentaRepository.save(crear);
    }

    public void eliminarCuenta(Long cuenta){
        if(!movimientoService.existCuenta(cuenta)){
            cuentaRepository.delete(cuentaRepository.getReferenceById(cuenta));
        }
    }




}
