package com.proyectoinfo.Sakura.repository;

import com.proyectoinfo.Sakura.domain.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {

    /*List<Carrito> findByDescription(String descripcion);

    List<Carrito> findByFechaCreacionBetween(LocalDate desde, LocalDate hasta);*/
}
