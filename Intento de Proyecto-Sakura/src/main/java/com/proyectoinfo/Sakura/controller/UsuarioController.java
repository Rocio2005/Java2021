package com.proyectoinfo.Sakura.controller;


import com.proyectoinfo.Sakura.domain.Usuario;
import com.proyectoinfo.Sakura.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
            this.usuarioRepository=usuarioRepository;
    }


    @PostMapping
    public ResponseEntity<?> createUsuario(@Valid @RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioRepository.save(usuario), HttpStatus.CREATED);/*codigo 201*/
    }

    /*@RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity(usuarioRepository.findAll(), HttpStatus.OK);
    }*/

    @GetMapping
    public ResponseEntity<?> traerTodos(){
        return new ResponseEntity<>(usuarioRepository.findAll(), HttpStatus.OK);
    }
}
