package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.repositories.StreetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {
    
    private final StreetRepository streetRepository;
    
    public StreetServiceImpl(StreetRepository streetRepository) {
        this.streetRepository = streetRepository;
    }
    
    @Override
    public List<StreetEntity> getStreets(Long cityId) {
        return streetRepository.findAllByCityEntityId(cityId);
    }
    
    @Override
    public StreetEntity getStreetDetails(Long id, Long cityId) {
        
        return streetRepository.findByIdAndCityEntityId(id, cityId);
    }
    
    @Override
    public StreetEntity save(StreetEntity streetEntity) {
        return streetRepository.save(streetEntity);
    }
}
