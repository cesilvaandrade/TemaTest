package com.example.tema.dto;


import com.example.tema.domain.Carta;
import com.example.tema.domain.enums.Classe;
import com.example.tema.domain.enums.Tipo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class CartaDTO implements Serializable {

    private Integer id;

    @Length(min = 5 , max = 80 , message = "O tamanho deve ser entre 5 e 80 caracteres")
    private String nome;

    @Length(min = 10 , max = 200 , message = "O tamanho deve ser entre 5 e 80 caracteres")
    private String descricao;

    @NotNull
    private Integer ataque;

    @NotNull
    private Integer defesa;

    @NotNull
    private Tipo tipo;

    @NotNull
    private Classe classe;

    public CartaDTO(Carta obj){
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.ataque = obj.getAtaque();
        this.classe = obj.getClasse();
        this.tipo = obj.getTipo();
        this.defesa = obj.getDefesa();
        this.descricao = obj.getDescricao();
    }
}
