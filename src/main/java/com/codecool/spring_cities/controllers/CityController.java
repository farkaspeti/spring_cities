package com.codecool.spring_cities.controllers;


import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.CityDto;
import com.codecool.spring_cities.model.ErrorDto;
import com.codecool.spring_cities.services.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class CityController {
    
    private final CityService cityService;
    
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    
    @RequestMapping(value = "/cities", produces = "application/json")
    @ResponseBody
    public List<CityEntity> getCities() throws ServiceException {
        return cityService.getCities();
    }
    
    @GetMapping(value = "cities/{id}", produces = "application/json")
    @ResponseBody
    public Optional<CityEntity> getCity(@PathVariable("id") Long id) throws ServiceException {
        return cityService.findCityById(id);
    }
    
    @PostMapping(value = "/cities", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public CityEntity addCity(@RequestBody CityDto cityDto) {
        return cityService.saveCity(cityDto);
    }
    
}

