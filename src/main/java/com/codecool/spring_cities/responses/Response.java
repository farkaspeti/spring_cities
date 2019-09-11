package com.codecool.spring_cities.responses;

public interface Response {
    
    int getCode();
    
    String getMessage();
    
    <T> T getData();
}
