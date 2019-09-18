package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.StatEntity;
import com.codecool.spring_cities.repositories.StatRepository;
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
