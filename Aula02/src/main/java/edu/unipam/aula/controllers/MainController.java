package com.unipam.aula.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.brans.factory.annotation.Autowired;
import com.unipam.aula.services.PedidoService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController{
    @Autowired
    PedidoService pedidoService;

    @GetMapping("/hello")
    public String get(){
        return "Hello world";
    }

    @GetMappping("/finalizar")
    public String finalizar(){
        pedidoService.finalizarPedido("celular");
        return"memes";
    }
}