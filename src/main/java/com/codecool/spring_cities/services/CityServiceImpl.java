package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.model.CityDto;
import com.codecool.spring_cities.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    
    private final CityRepository cityRepository;
    
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    
    @Override
    public List<CityEntity> getCities() {
        
        return (List) cityRepository.findAll();
    }
    
    @Override
    public CityEntity findCityById(long cityId) {
        
        return cityRepository.findById(cityId);
    }
    
    @Override
    public CityEntity saveCity(CityDto cityDto) {
        CityEntity cityEntity = cityRepository.save(CityEntity.builder()
                .cityName(cityDto.getCityName())
                .population(cityDto.getPopulation())
                .build());
        
        return cityEntity;
    }
    
    @Override
    public Boolean findCity(Long id) {
        return cityRepository.findById(id) != null;
    }
}
