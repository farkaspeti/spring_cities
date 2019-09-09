package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.CityEntity;

import java.util.Set;

public interface CityService {
    
    Set<CityEntity> getCities();
    
    CityEntity getCity(Long id);
    
    CityEntity saveCity(CityEntity cityEntity);
}
