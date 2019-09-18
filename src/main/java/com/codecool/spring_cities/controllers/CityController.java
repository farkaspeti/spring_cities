package com.codecool.spring_cities.controllers;


import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.CityDto;
import com.codecool.spring_cities.services.CityService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.*;


import java.lang.reflect.Type;
import java.util.List;


@RestController
public class CityController {
    
    private final CityService cityService;
    private final ModelMapper modelMapper = new ModelMapper();
    
    public CityController(CityService cityService) {
        
        this.cityService = cityService;
    }
    
    @RequestMapping(value = "/cities", produces = "application/json")
    @ResponseBody
    public List<CityDto> getCities() throws ServiceException {
        if (cityService.getCities() != null) {
            Type listType = new TypeToken<List<CityDto>>() {
            }.getType();
            return modelMapper.map(cityService.getCities(), listType);
        }
        throw new ServiceException("There are no cities in this application?!");
    }
    
    @GetMapping(value = "cities/{id}", produces = "application/json")
    @ResponseBody
    public CityDto getCity(@PathVariable("id") Long id) throws ServiceException {
        if (cityService.findCityById(id) != null) {
            return modelMapper.map(cityService.findCityById(id), CityDto.class);
        }
        throw new ServiceException("There is no such City with the given Id: " + id);
    }
    
    @PostMapping(value = "/cities", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public CityEntity addCity(@RequestBody CityDto cityDto) {
        return cityService.saveCity(cityDto);
    }
}

