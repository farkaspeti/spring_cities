package com.codecool.spring_cities.errors;

import lombok.Getter;

@Getter
public enum ErrorCities implements Error {
    ;
    
    private final int code;
    private final String message;
    
    ErrorCities(int code, String message) {
        this.code = code;
        this.message = message;
    }
    
    
    @Override
    public String toString() {
        return code + ": " + message;
    }
}
