package com.luv2code.springdemo.rest;

//с помощью этого класса выбрасываются ошибки
public class CustomerNotFoundExeption extends RuntimeException {

    public CustomerNotFoundExeption() {
        super();
    }

    public CustomerNotFoundExeption(String message) {
        super(message);
    }

    public CustomerNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerNotFoundExeption(Throwable cause) {
        super(cause);
    }

    protected CustomerNotFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
