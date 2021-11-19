package com.example.curso.resources;

import com.example.curso.domain.Categoria;
import com.example.curso.services.CategoriaService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET , value = "/{id}")
    public ResponseEntity<Categoria> find(@PathVariable Integer id) {
        return ResponseEntity.ok().body(categoriaService.buscar(id));
    }



}
