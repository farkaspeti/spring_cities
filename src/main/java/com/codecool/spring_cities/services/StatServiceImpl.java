package com.codecool.spring_cities.services;

import com.codecool.spring_cities.exceptions.ServiceException;
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
    
    @Override
    public double averageResidentsInCity(Long cityId) {
        return statRepository.averageResidentsInCity(cityId);
    }
    
    @Override
    public double averagePopulation() {
        return statRepository.averagePopulation();
    }
    
    @Override
    public long populationInCity(Long cityId) {
        return statRepository.populationInCity(cityId);
    }
}
