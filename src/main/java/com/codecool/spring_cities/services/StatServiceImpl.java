package com.codecool.spring_cities.services;

import com.codecool.spring_cities.repositories.CityRepository;
import com.codecool.spring_cities.repositories.HouseRepository;
import com.codecool.spring_cities.repositories.StreetRepository;
import org.springframework.stereotype.Service;

@Service
public class StatServiceImpl implements StatService {
    
    private final CityRepository cityRepository;
    private final HouseRepository houseRepository;
    private final StreetRepository streetRepository;
    
    public StatServiceImpl(CityRepository cityRepository, HouseRepository houseRepository, StreetRepository streetRepository) {
        this.cityRepository = cityRepository;
        this.houseRepository = houseRepository;
        this.streetRepository = streetRepository;
    }
    
    @Override
    public double averageResidents() {
        return 0;
    }
    
    @Override
    public double averageResidentsInCity(Long cityId) {
        return 0;
    }
    
    @Override
    public double averagePopulationInCity(Long cityId) {
        return 0;
    }
}
