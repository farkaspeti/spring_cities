package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.StatEntity;
import com.codecool.spring_cities.exceptions.ServiceException;


public interface StatService {
    
    double averageResidents() throws ServiceException;
    
    /*double averageResidentsInCity(Long cityId);
    
    double averagePopulationInCity(Long cityId);*/

}
