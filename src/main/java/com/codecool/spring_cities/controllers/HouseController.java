package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.model.House;
import com.codecool.spring_cities.services.HouseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houses")
public class HouseController {
    
    private final HouseService houseService;
    
    HouseController(HouseService houseService) {
        this.houseService = houseService;
    }
    
    @GetMapping(value = "/{id}", produces = "application/json")
    public House getHouseById(@PathVariable("id") Long id) {
        return houseService.getHouse(id);
    }
}
