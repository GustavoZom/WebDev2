package edu.unipam.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PedidoService{
    @Autowired
    private NotificacaoService notificacaoService;

    PedidoService(NotificacaoService notificacaoService){
        this.notificacaoService = notificacaoService;
    }

    public Boolean finalizarPedido(string pedido){
        notificacaoService.enviar("O pedido " + pedido + "foi enviado com sucesso");
        return true;
    }
}