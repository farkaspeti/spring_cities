package com.codecool.spring_cities.services;

public interface StatService {
    
    double avarageResidents();
    
    double avarageResidentsInCity(Long cityId);
    
    double avaragePopulationInCity(Long cityId);

}
