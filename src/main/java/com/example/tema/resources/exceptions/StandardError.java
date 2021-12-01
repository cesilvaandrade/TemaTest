package com.example.tema.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class StandardError implements Serializable {

    private static long serialVersionUID = 1L;

    private Integer status;
    private String msg;
    private Long timeStamp;
}
