package com.codecool.spring_cities.services;

import com.codecool.spring_cities.domain.City;
import com.codecool.spring_cities.domain.House;

public interface HouseService {

    House getHouse(City city);
    
}
