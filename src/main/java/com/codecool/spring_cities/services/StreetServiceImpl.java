package com.codecool.spring_cities.services;

import com.codecool.spring_cities.domain.City;
import com.codecool.spring_cities.domain.Street;
import com.codecool.spring_cities.repositories.StreetRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StreetServiceImpl implements StreetService {
    
    private final StreetRepository streetRepository;
    
    public StreetServiceImpl(StreetRepository streetRepository) {
        this.streetRepository = streetRepository;
    }
    
    @Override
    public Set<Street> getStreets(City city) {
        Set<Street> streetSet = new HashSet<>();
        streetRepository.findAllById(city.getId()).iterator().forEachRemaining(streetSet::add);
        
        return streetSet;
    }
    
    @Override
    public Street getStreet(Long id) {
        
        return streetRepository.findById(id).get();
    }
}
