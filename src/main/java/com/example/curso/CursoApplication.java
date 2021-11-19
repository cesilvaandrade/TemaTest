package com.example.curso;

import com.example.curso.domain.Categoria;
import com.example.curso.domain.Produto;
import com.example.curso.repositories.CategoriaRepository;
import com.example.curso.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = Categoria.builder().nome("informatica").produtos(new ArrayList<>()).build();
        Categoria cat2 = Categoria.builder().nome("escritorio").produtos(new ArrayList<>()).build();
        Produto p1 = Produto.builder().nome("Computador").categorias(new ArrayList<>()).preco(2500.00).build();
        Produto p2 = Produto.builder().nome("Mouse").preco(80.00).categorias(new ArrayList<>()).build();
        Produto p3 = Produto.builder().nome("Impressora").preco(800.00).categorias(new ArrayList<>()).build();

        cat1.getProdutos().add(p1);
        cat2.getProdutos().addAll(Collections.singletonList(p3));

        p1.getCategorias().addAll(Collections.singletonList(cat1));
        p2.getCategorias().addAll(Collections.singletonList(cat1));
        p3.getCategorias().addAll(Arrays.asList(cat1,cat2));

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
        produtoRepository.saveAll(Arrays.asList(p1,p2,p3));


    }
}
