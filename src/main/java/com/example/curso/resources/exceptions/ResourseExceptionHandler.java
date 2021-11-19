package com.example.curso.resources.exceptions;

import com.example.curso.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourseExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e , HttpServletRequest request){
        StandardError err= new StandardError(HttpStatus.NOT_FOUND.value() , e.getMessage() , System.currentTimeMillis());
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}
