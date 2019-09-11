package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.CityDto;

import java.util.List;
import java.util.Optional;


public interface CityService {
    
    List<CityEntity> getCities() throws ServiceException;
    
    Optional<CityEntity> findCityById(Long id) throws ServiceException;
    
    CityEntity saveCity(CityDto cityDto);
    
    Boolean findCity(Long id);
}
