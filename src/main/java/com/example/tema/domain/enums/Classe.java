package com.example.tema.domain.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum Classe {

    MAGO(1 , "Mago"),
    PALADINO(2, "Paladino"),
    CACADOR(3, "Caçador"),
    DRUIDA(4, "Druida"),
    QUALQUER(5, "Qualquer");
    private int cod;
    private String descricao;

    public int getCodigo(){
        return cod;
    }

    public String getDescricao(){
        return descricao;
    }

    public static Classe toEnum(Integer cod){
        if ( cod == null){
            return null;
        }
        for (Classe x: Classe.values()) {
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("id inválido: " + cod);
    }

}
