package com.banca.innovacion.services;


import com.banca.innovacion.dto.MonedaDto;
import com.banca.innovacion.model.Moneda;
import com.banca.innovacion.repository.MonedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class MonedaService {

    @Autowired
    MonedaRepository monedaRepository;

    public void  save(MonedaDto moneda){
        Moneda crearMoneda = new Moneda(moneda.getDsnombre(),moneda.getPtmontomax());
        monedaRepository.save(crearMoneda);
    }




}
