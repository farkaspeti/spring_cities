package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.StreetEntity;

import java.util.Set;

public interface StreetService {
    
    Set<StreetEntity> getStreets(Long cityId);
    
    StreetEntity getStreetDetails(Long id, Long cityId);
}
