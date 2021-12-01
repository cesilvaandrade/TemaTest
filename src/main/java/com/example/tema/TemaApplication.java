package com.example.tema;

import com.example.tema.repositories.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemaApplication implements CommandLineRunner {

    @Autowired
    CartaRepository cartaRepository;

    public static void main(String[] args) {
        SpringApplication.run(TemaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
