package com.example.curso.repositories;

import com.example.curso.domain.Cidade;
import com.example.curso.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
