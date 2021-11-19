package com.example.curso.resources;

import com.example.curso.domain.Categoria;
import com.example.curso.domain.Cliente;
import com.example.curso.services.CategoriaService;
import com.example.curso.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cliente")
public class ClienteResource {


    @Autowired
    private ClienteService clienteService;

    @RequestMapping(method = RequestMethod.GET , value = "/{id}")
    public ResponseEntity<Cliente> find(@PathVariable Integer id) {
        return ResponseEntity.ok().body(clienteService.buscar(id));
    }

}
