package com.codecool.spring_cities.controllers;


import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.services.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Set;

@RestController
public class CityController {
    
    private final CityService cityService;
    
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    
    @RequestMapping(value = "/cities", produces = "application/json")
    @ResponseBody
    public Set<CityEntity> getCities() {
        return cityService.getCities();
    }
    
    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getCity(@PathVariable("id") Long id) {
    
        if (!cityService.findCity(id)) {
            return ResponseEntity.badRequest().body("There is no city in the database with the given ID");
        }
        return new ResponseEntity<>("City is found: " + cityService.getCity(id),HttpStatus.OK);
    }
    @PostMapping(value = "/cities", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public CityEntity addCity() {
        return null;
    }
}

