package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.entities.HouseEntity;
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
    @ResponseBody
    public HouseEntity getHouseById(@PathVariable("id") Long id) {
        //return houseService.getHouse(id);
        return null;
    }
    
    @PostMapping(value = "/houses", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public HouseEntity addHouse() {
        return null;
    }
}
