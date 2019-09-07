package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.model.House;
import com.codecool.spring_cities.services.HouseServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houses")
public class HouseController {
    
    HouseServiceImpl houseServiceImpl;
    
    HouseController(HouseServiceImpl houseServiceImpl){
        this.houseServiceImpl = houseServiceImpl;
    }
    
    @GetMapping(value = "/{id}")
    public House getHouseById(@PathVariable("id") Long id) {
        return houseServiceImpl.getHouse(id);
    }
}
