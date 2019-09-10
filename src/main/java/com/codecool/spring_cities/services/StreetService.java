package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.model.StreetDto;

import java.util.List;


public interface StreetService {
    
    List<StreetEntity> getStreets(Long cityId);
    
    StreetEntity getStreetDetails(Long id, Long cityId);
    
    StreetEntity saveStreet(StreetDto streetDto);
}
