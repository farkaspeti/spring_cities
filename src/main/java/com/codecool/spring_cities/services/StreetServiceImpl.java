package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.Street;
import com.codecool.spring_cities.repositories.StreetRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StreetServiceImpl implements StreetService {
    
    private final StreetRepository streetRepository;
    
    public StreetServiceImpl(StreetRepository streetRepository) {
        this.streetRepository = streetRepository;
    }
    
    @Override
    public Set<Street> getStreets(Long cityId) {
        return streetRepository.findAllByCityId(cityId);
    }
    
    @Override
    public Street getStreetDetails(Long id, Long cityId) {
        
        return streetRepository.getStreetDetails(id, cityId);
    }
}
