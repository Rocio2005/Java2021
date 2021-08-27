package com.proyectoinfo.Sakura.controller;

import com.proyectoinfo.Sakura.domain.Carrito;
import com.proyectoinfo.Sakura.domain.Indumentaria;
import com.proyectoinfo.Sakura.domain.LineaDeCarrito;
import com.proyectoinfo.Sakura.domain.Usuario;
import com.proyectoinfo.Sakura.dto.OperacionCarrito;
import com.proyectoinfo.Sakura.repository.CarritoRepository;
import com.proyectoinfo.Sakura.repository.IndumentariaRepository;
import com.proyectoinfo.Sakura.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CarritoController {

    private final UsuarioRepository usuarioRepository;
    private final CarritoRepository carritoRepository;
    private final IndumentariaRepository indumentariaRepository;

    public CarritoController (UsuarioRepository usuarioRepository, CarritoRepository carritoRepository,IndumentariaRepository
                              indumentariaRepository){
        this.usuarioRepository=usuarioRepository;
        this.carritoRepository=carritoRepository;
        this.indumentariaRepository=indumentariaRepository;

    }

    @PostMapping("/usuario/{id}/carrito")//le paso el id del usuario propietario del carrito en Postman
    public ResponseEntity<?> createCarrito(@PathVariable("id") Long userId, @Valid @RequestBody Carrito carrito){

        Usuario usuario=usuarioRepository.getById(userId);
        carrito.setUsuario(usuario);
        return new ResponseEntity<>(carritoRepository.save(carrito), HttpStatus.CREATED);

    }

    @PutMapping("/usuario/{id}/carrito/{idCarrito}")//agregar indumentaria al carrito del usuario tal a su carrito tanto
    public ResponseEntity<?> agregarIndumentaria(@PathVariable("id") Long userId,@PathVariable("idCarrito") Long idCarrito,
                                                 @Valid @RequestBody OperacionCarrito operacionCarrito) {
        //la operacion carrito me envia un producto
        Carrito carrito=carritoRepository.getById(idCarrito);

        /*for (LineaDeCarrito lineaDeCarrito:carrito.getLineasDeCarrito()){
            boolean exist=operacionCarrito.getIndumentariaId().equals(lineaDeCarrito.getIndumentaria().getId());
            //si existe no hago nada,sobrescribo el valor de la cantidad o lo piso¿?
            lineaDeCarrito.setCantidad(operacionCarrito.getCantidad());

            // o sino acumulo
            lineaDeCarrito.setCantidad(lineaDeCarrito.getCantidad()+ operacionCarrito.getCantidad());
        }*///no se porque se repite en POSTMAN

        Indumentaria indumentaria= indumentariaRepository.getById(operacionCarrito.getIndumentariaId());//busco el producto que pase en la operación carrito
        LineaDeCarrito lineaDeCarrito=new LineaDeCarrito();//creo el detalle del producto
        lineaDeCarrito.setCarrito(carrito);
        lineaDeCarrito.setIndumentaria(indumentaria);
        lineaDeCarrito.setCantidad(operacionCarrito.getCantidad());
        carrito.agregarLineaDeCarrito(lineaDeCarrito);
        return new ResponseEntity<>(carritoRepository.save(carrito), HttpStatus.CREATED);
    }

    @DeleteMapping("/usuario/{id}/carrito/{idCarrito}/linea/{idLinea}")//linea o descripcion o detalle o producto
    public ResponseEntity<?> borrarLinea(@PathVariable("id") Long userId,@PathVariable("idCarrito") Long idCarrito,
                                                 @PathVariable("idLinea") Long id,
                                                 @PathVariable("idIndumentaria")
                                                 @Valid @RequestBody OperacionCarrito operacionCarrito){
        Carrito carrito=carritoRepository.getById(idCarrito);//busca mi carrito(el que le pedi en la request) en la base de datos
        Indumentaria indumentaria=indumentariaRepository.getById(operacionCarrito.getIndumentariaId());//obtengo mi producto por la id que le pase
        LineaDeCarrito lineaDeCarrito=new LineaDeCarrito();//creo una linea para llamar al detalle del producto anterior
        //le paso a linea de carrito los datos necesarios para crear el detalle de esa indumentaria de mi carrito
        lineaDeCarrito.setCarrito(carrito);
        lineaDeCarrito.setIndumentaria(indumentaria);
        lineaDeCarrito.setCantidad(operacionCarrito.getCantidad());
        carrito.removerLineaDeCarrito(lineaDeCarrito);
        return new ResponseEntity<>(carritoRepository.save(carrito),HttpStatus.ACCEPTED);

    }




}
