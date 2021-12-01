package com.example.curso.resources;

import com.example.curso.domain.Pedido;
import com.example.curso.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/pedido")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.GET , value = "/{id}")
    public ResponseEntity<Pedido> find(@PathVariable Integer id) {
        return ResponseEntity.ok().body(pedidoService.find(id));
    }

}
