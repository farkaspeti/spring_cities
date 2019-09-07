package com.codecool.spring_cities.services;

import com.codecool.spring_cities.model.House;

public interface HouseService {

    House getHouse(Long cityId);
    
}
