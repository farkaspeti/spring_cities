package com.codecool.spring_cities.services;


import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.repositories.HouseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HouseServiceImpl implements HouseService {
    
    private final HouseRepository houseRepository;
    
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }
    
    @Override
    public Optional<HouseEntity> getHouse(Long cityId) {
        return houseRepository.findById(cityId);
    }
}
