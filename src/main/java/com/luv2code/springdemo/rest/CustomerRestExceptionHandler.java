package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


//эта аннотация говорит о том, что все методы которые находятся внутри этого класса будут применятся для каждого контроллера
@ControllerAdvice
public class CustomerRestExceptionHandler {

    //пример перехвата одной ошибки
    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundExeption exc){
        CustomerErrorResponse errorResponse = new CustomerErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                exc.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }


    //пример перехвата неизвестной ошибки
    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(Exception exc){
        CustomerErrorResponse errorResponse = new CustomerErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exc.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}

