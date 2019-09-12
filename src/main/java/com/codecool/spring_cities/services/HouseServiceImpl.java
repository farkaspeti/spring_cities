package com.codecool.spring_cities.services;


import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.model.HouseDto;
import com.codecool.spring_cities.repositories.HouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    
    private final HouseRepository houseRepository;
    
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }
    
    @Override
    public List<HouseEntity> findByCityEntityId(Long cityId) {
        return houseRepository.findByCityEntityId(cityId);
    }
    
    
    @Override
    public HouseEntity findHouseById(long houseId) {
        return houseRepository.findById(houseId);
    }
    
    @Override
    public HouseEntity saveHouse(HouseDto houseDto) {
        HouseEntity houseEntity = houseRepository.save(HouseEntity.builder()
                .houseResidents(houseDto.getHouseResidents())
                .houseNumber(houseDto.getHouseNumber())
                .build());
        return houseEntity;
    }
}
