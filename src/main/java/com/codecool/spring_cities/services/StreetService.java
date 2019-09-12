package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.StreetDto;

import java.util.List;


public interface StreetService {
    
    List<StreetEntity> findAllByCityEntityId(Long cityId) throws ServiceException;
    
    StreetEntity findByIdAndCityEntityId(Long id, Long cityId) throws ServiceException;
    
    StreetEntity saveStreet(StreetDto streetDto, Long cityId);
}
