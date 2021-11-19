package com.example.curso.services;

import com.example.curso.domain.Categoria;
import com.example.curso.domain.Cliente;
import com.example.curso.repositories.CategoriaRepository;
import com.example.curso.repositories.ClienteRepository;
import com.example.curso.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {


    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: "+ id + " Tipo: " + Cliente.class.getName()));
    }

}
