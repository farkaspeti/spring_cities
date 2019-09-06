package com.codecool.spring_cities.services;

import com.codecool.spring_cities.domain.City;
import com.codecool.spring_cities.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CityServiceImpl implements CityService {
    
    private final CityRepository cityRepository;
    
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    
    @Override
    public Set<City> getCities() {
        Set<City> citySet = new HashSet<>();
        
        cityRepository.findAll().iterator().forEachRemaining(citySet::add);
        return citySet;
    }
    
    @Override
    public City getCity(Long id) {
        
        return cityRepository.findById(id).get();
    }
}
