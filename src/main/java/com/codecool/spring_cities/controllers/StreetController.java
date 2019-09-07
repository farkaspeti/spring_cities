package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.model.Street;
import com.codecool.spring_cities.services.StreetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {
    
    private final StreetService streetService;
    
    public StreetController(StreetService streetService) {
        this.streetService = streetService;
    }
    
    @GetMapping(value = "/{cityId}/street", produces = "application/json")
    public List<Street> getAllStreetByCityId(@PathVariable("cityId") Long cityId) {
        return null;
    }
    
    @GetMapping(value = "/{cityId}/street/{streetId}", produces = "application/json")
    public Street getStreetDetailsByCityId(@PathVariable("cityId") Long cityId, @PathVariable("streetId") Long streetId) {
        return null;
    }
}
