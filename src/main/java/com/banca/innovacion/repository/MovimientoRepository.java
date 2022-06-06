package com.banca.innovacion.repository;

import com.banca.innovacion.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {


    @Query(value = "{call PCK_MOVIMIENTOS.SP_MOVIMIENTOS(:nmcuenta_origenIn, :nmcuenta_destinoIn, :ptmontoIn)}", nativeQuery = true)
    void movimientos_procedure(
            @Param("nmcuenta_origenIn")long nmcuenta_origenIn,
            @Param("nmcuenta_destinoIn")long nmcuenta_destinoIn,
            @Param("ptmontoIn")Double ptmontoIn);


    boolean existsByNmcuentaOrigen(long nmcuentaOrigen);
    boolean existsByNmcuentaDestino(long nmcuentaDestino);

}
