package com.proyectoinfo.Sakura.controller;

import com.proyectoinfo.Sakura.domain.Indumentaria;
import com.proyectoinfo.Sakura.domain.Usuario;
import com.proyectoinfo.Sakura.repository.IndumentariaRepository;
import com.proyectoinfo.Sakura.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/indumentaria")
public class IndumentariaController {

    private IndumentariaRepository indumentariaRepository;

    public IndumentariaController(IndumentariaRepository indumentariaRepository){
        this.indumentariaRepository=indumentariaRepository;
    }

    @PostMapping
    public ResponseEntity<?> createIndumentaria(@Valid @RequestBody Indumentaria indumentaria){
        return new ResponseEntity<>(indumentariaRepository.save(indumentaria), HttpStatus.CREATED);/*codigo 201*/
    }


}
