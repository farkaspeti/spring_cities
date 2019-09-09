package com.codecool.spring_cities.services;

import com.codecool.spring_cities.model.City;
import com.codecool.spring_cities.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CityServiceImpl implements CityService {
    
    private final CityRepository cityRepository;
    
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    
    @Override
    public Set<City> getCities() {
        
        return (Set) cityRepository.findAll();
    }
    
    @Override
    public City getCity(Long cityId) {
        
        return cityRepository.getCity(cityId);
    }
}
