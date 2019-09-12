package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.CityDto;

import java.util.List;


public interface CityService {
    
    List<CityEntity> getCities() throws ServiceException;
    
    CityEntity findCityById(long id) throws ServiceException;
    
    CityEntity saveCity(CityDto cityDto);
    
    Boolean findCity(Long id);
}
