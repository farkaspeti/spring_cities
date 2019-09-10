package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.CityEntity;
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
    public Set<CityEntity> getCities() {
        
        return (Set) cityRepository.findAll();
    }
    
    @Override
    public CityEntity getCity(Long cityId) {
        
        return cityRepository.getCity(cityId);
    }
    
    @Override
    public CityEntity saveCity(CityEntity cityEntity) {
        
        return null;
    }
    
    @Override
    public Boolean findCity(Long id) {
        return cityRepository.getCity(id) != null;
    }
}
