package com.codecool.spring_cities.services;

import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.model.StreetDto;
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
    public List<StreetEntity> findAllByCityEntityId(Long cityId) {
        return streetRepository.findAllByCityEntityId(cityId);
    }
    
    @Override
    public StreetEntity findByIdAndCityEntityId(Long cityEntityId, Long streetId) {
        
        return streetRepository.findByIdAndCityEntityId(streetId, cityEntityId);
    }
    
    @Override
    public StreetEntity saveStreet(StreetDto streetDto, Long cityId) {
        StreetEntity streetEntity = streetRepository.save(StreetEntity.builder()
                .streetName(streetDto.getStreetName())
                .build());
        return streetEntity;
    }
}
