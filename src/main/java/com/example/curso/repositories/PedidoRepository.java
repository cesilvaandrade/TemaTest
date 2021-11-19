package com.example.curso.repositories;

import com.example.curso.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido , Integer> {
}
