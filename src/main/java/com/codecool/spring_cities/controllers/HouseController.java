package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.entities.House;
import com.codecool.spring_cities.services.HouseService;
import org.springframework.web.bind.annotation.*;

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
    
    @PostMapping(value = "/houses", consumes = "application/json", produces = "application/json")
    public House addHouse() {
        return null;
    }
}
