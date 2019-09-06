package com.codecool.spring_cities.services;


import com.codecool.spring_cities.domain.City;
import com.codecool.spring_cities.domain.House;
import com.codecool.spring_cities.repositories.HouseRepository;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {
    
    private final HouseRepository houseRepository;
    
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }
    
    @Override
    public House getHouse(City city) {
        return houseRepository.findById(city.getId()).get();
    }
}
