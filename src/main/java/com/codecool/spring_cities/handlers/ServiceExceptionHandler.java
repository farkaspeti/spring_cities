package com.codecool.spring_cities.handlers;

import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.ErrorDto;
import org.springframework.aop.AopInvocationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ServiceExceptionHandler {
    
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<ErrorDto> numberFormatExceptionHandler(NumberFormatException ex) {
        return new ResponseEntity<>(new ErrorDto(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ErrorDto> serviceExceptionHandler(ServiceException ex) {
        return new ResponseEntity<>(new ErrorDto(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(AopInvocationException.class)
    public ResponseEntity<ErrorDto> AopInvocationExceptionHandler(AopInvocationException ex) {
        return new ResponseEntity<>(new ErrorDto(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
