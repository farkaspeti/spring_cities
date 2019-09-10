package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.CityEntity;

import java.util.List;
import java.util.Optional;


public interface CityService {
    
    List<CityEntity> getCities();
    
    Optional<CityEntity> findCityById(Long id);
    
    CityEntity save(CityEntity cityEntity);
    
    Boolean findCity(Long id);
}
