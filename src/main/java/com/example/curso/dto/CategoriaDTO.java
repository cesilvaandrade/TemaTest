package com.example.curso.dto;

import com.example.curso.domain.Categoria;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class CategoriaDTO implements Serializable {
    private Integer id;

    @Length(min = 5 , max = 80 , message = "O tamanho deve ser entre 5 e 80 caracteres")
    private String nome;

    public CategoriaDTO(Categoria obj){
        this.id = obj.getId();
        this.nome = obj.getNome();
    }
}
