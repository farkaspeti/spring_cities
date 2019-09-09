package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.Street;

import java.util.Set;

public interface StreetService {
    
    Set<Street> getStreets(Long cityId);
    
    Street getStreetDetails(Long id,Long cityId);
}
