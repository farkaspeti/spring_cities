package com.codecool.spring_cities.services;


import com.codecool.spring_cities.entities.House;
import com.codecool.spring_cities.repositories.HouseRepository;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {
    
    private final HouseRepository houseRepository;
    
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }
    
    @Override
    public House getHouse(Long cityId) {
        return houseRepository.getHouseByCityId(cityId);
    }
}
