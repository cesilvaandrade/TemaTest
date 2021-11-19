package com.example.curso.repositories;

import com.example.curso.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
