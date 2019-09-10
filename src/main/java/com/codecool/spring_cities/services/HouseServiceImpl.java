package com.codecool.spring_cities.services;


import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.model.HouseDto;
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
    
    @Override
    public HouseEntity saveHouse(HouseDto houseDto) {
        HouseEntity houseEntity = houseRepository.save(HouseEntity.builder()
                .cityEntity(houseDto.getCityEntity())
                .streetEntity(houseDto.getStreetEntity())
                .houseResidents(houseDto.getHouseResidents())
                .houseNumber(houseDto.getHouseNumber())
                .build());
        return houseEntity;
    }
}
