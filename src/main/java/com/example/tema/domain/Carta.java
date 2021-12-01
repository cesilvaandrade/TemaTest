package com.example.tema.domain;

import com.example.tema.domain.enums.Classe;
import com.example.tema.domain.enums.Tipo;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Carta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Integer ataque;
    private Integer defesa;
    private Tipo tipo;
    private Classe classe;

    public Carta(Integer id, String nome , Integer ataque ,
                 Integer defesa , Classe classe , Tipo tipo ,String descricao) {
        this.setId(id);
        this.setNome(nome);
        this.setAtaque(ataque);
        this.setClasse(classe);
        this.setDefesa(defesa);
        this.setDescricao(descricao);
        this.setTipo(tipo);
    }
}
