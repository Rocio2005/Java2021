package com.proyectoinfo.Sakura.repository;

import com.proyectoinfo.Sakura.domain.Indumentaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IndumentariaRepository extends JpaRepository<Indumentaria, Long> {

    /*List<Indumentaria> findByDescription(String descripcion);*/
}
