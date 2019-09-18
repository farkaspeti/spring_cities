package com.codecool.spring_cities.services;

import com.codecool.spring_cities.exceptions.ServiceException;


public interface StatService {
    
    double averageResidents() throws ServiceException;
    
    double averageResidentsInCity(Long cityId) throws ServiceException;
    
    double averagePopulation() throws ServiceException;
    
    double averagePopulationInCity(Long cityId) throws ServiceException;

}
