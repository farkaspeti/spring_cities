package com.codecool.spring_cities.services;

import com.codecool.spring_cities.repositories.CityRepository;
import com.codecool.spring_cities.repositories.HouseRepository;
import com.codecool.spring_cities.repositories.StatRepository;
import com.codecool.spring_cities.repositories.StreetRepository;
import org.springframework.stereotype.Service;

@Service
public class StatServiceImpl implements StatService {
    
    private final StatRepository statRepository;
    
    public StatServiceImpl(StatRepository statRepository) {
        this.statRepository = statRepository;
    }
    
    @Override
    public double averageResidents() {
        return statRepository.averageResidents();
    }
    
   /* @Override
    public double averageResidentsInCity(Long cityId) {
        return 0;
    }
    
    @Override
    public double averagePopulationInCity(Long cityId) {
        return 0;
    }*/
}
