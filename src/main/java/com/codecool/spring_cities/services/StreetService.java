package com.codecool.spring_cities.services;

import com.codecool.spring_cities.domain.City;
import com.codecool.spring_cities.domain.Street;

import java.util.Set;

public interface StreetService {
    
    Set<Street> getStreets(City city);
    
    Street getStreet(Long id);
}
