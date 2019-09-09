package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.HouseEntity;

public interface HouseService {

    HouseEntity getHouse(Long cityId);
    
}
