package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.HouseEntity;

import java.util.Optional;

public interface HouseService {

    Optional<HouseEntity> getHouse(Long cityId);
    
}
