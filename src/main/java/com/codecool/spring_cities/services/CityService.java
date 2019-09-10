package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.model.CityDto;

import java.util.List;
import java.util.Optional;


public interface CityService {
    
    List<CityEntity> getCities();
    
    Optional<CityEntity> findCityById(Long id);
    
    CityEntity saveCity(CityDto cityDto);
    
    Boolean findCity(Long id);
}
