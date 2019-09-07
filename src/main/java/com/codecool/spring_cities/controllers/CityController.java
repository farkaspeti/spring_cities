package com.codecool.spring_cities.controllers;


import com.codecool.spring_cities.model.City;
import com.codecool.spring_cities.services.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Set;

@RestController
public class CityController {
    
    private final CityService cityService;
    
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    
    @RequestMapping(value = "/cities", produces = "application/json")
    public Set<City> getCities() {
        return cityService.getCities();
    }
    
    @GetMapping(value = "/{id}", produces = "application/json")
    public City getCityId(@PathVariable("id") Long id) {
        return cityService.getCity(id);
    }
}

