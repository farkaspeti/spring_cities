package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.City;

import java.util.Set;

public interface CityService {
    
    Set<City> getCities();
    
    City getCity(Long id);
    
    City addCity(City city);
}
