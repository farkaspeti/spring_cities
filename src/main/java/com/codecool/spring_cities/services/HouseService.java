package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.HouseDto;

import java.util.List;

public interface HouseService {
    
    List<HouseEntity> findByCityEntityId(Long cityId) throws ServiceException;
    
    HouseEntity findHouseById(long id) throws ServiceException;
    
    HouseEntity saveHouse(HouseDto houseDto);
}
