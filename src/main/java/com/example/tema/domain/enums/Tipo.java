package com.example.tema.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Tipo {

    MAGIA(1 , "Magia"),
    CRIATURA(2, "Criatura");
    private int cod;
    private String descricao;

    public int getCodigo(){
        return cod;
    }

    public String getDescricao(){
        return descricao;
    }

    public static Tipo toEnum(Integer cod){
        if ( cod == null){
            return null;
        }
        for (Tipo x: Tipo.values()) {
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("id inválido: " + cod);
    }
}
