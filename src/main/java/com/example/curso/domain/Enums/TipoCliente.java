package com.example.curso.domain.Enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoCliente {

    PESSOA_FISICA(1 , "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    private int cod;
    private String descricao;

    public int getCodigo(){
        return cod;
    }

    public String getDescricao(){
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod){
        if ( cod == null){
            return null;
        }
        for (TipoCliente x: TipoCliente.values()) {
            if(cod.equals(x.getCodigo())){
                return x;
            }
        }
        throw new IllegalArgumentException("id iválido: " + cod);
    }

}
