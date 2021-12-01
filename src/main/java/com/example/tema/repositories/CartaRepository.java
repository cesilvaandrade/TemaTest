package com.example.tema.repositories;

import com.example.tema.domain.Carta;
import com.example.tema.domain.enums.Classe;
import com.example.tema.domain.enums.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Integer> {
    List<Carta> findCartasByNomeContains(String nome);
    List<Carta> findCartasByClasse(Classe classe);
    List<Carta> findCartasByTipo(Tipo tipo);
}
