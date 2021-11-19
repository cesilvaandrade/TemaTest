package com.example.curso.domain;

import com.example.curso.domain.Enums.TipoCliente;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cidade cidade;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cliente cliente;
}
