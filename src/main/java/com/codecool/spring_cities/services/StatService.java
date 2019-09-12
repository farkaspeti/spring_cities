package com.codecool.spring_cities.services;

public interface StatService {
    
    double averageResidents();
    
    double averageResidentsInCity(Long cityId);
    
    double averagePopulationInCity(Long cityId);

}
