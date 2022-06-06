package com.banca.innovacion.services;

import com.banca.innovacion.model.Cuenta;
import com.banca.innovacion.model.Movimiento;
import com.banca.innovacion.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.net.HttpURLConnection;
import java.util.List;

@Service
@Transactional
public class MovimientoService {

    @Autowired
    MovimientoRepository moviemientoRepository;

    public void movimientoProcedure(Movimiento movimiento){
        try{
            moviemientoRepository.movimientos_procedure(movimiento.getNmcuentaOrigen(),movimiento.getNmcuentaDestino(),movimiento.getPtmonto());
        }catch (Exception e){
        }
    }

    public List<Movimiento> findAll(){
        return moviemientoRepository.findAll();
    }

    public boolean existCuenta(Long cuenta){
        if(moviemientoRepository.existsByNmcuentaOrigen(cuenta) == true ||
                moviemientoRepository.existsByNmcuentaDestino(cuenta) == true){
            return true;
        }else{
            return false;
        }
    }





}
