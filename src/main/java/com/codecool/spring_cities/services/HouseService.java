package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.model.HouseDto;

import java.util.Optional;

public interface HouseService {
    
    Optional<HouseEntity> getHouse(Long cityId);
    
    HouseEntity saveHouse(HouseDto houseDto);
}
