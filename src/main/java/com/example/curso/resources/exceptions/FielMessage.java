package com.example.curso.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FielMessage implements Serializable {

    private static long serialVersionUID = 1L;

    private String fieldName;
    private String message;

}
