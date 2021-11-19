package com.example.curso.services;

import com.example.curso.domain.Pedido;
import com.example.curso.repositories.PedidoRepository;
import com.example.curso.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: "+ id + " Tipo: " + Pedido.class.getName()));
    }
    
}
