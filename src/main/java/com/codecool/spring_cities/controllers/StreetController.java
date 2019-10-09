package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.StreetDto;
import com.codecool.spring_cities.services.StreetService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {
    
    
    private final StreetService streetService;
    private final ModelMapper modelMapper = new ModelMapper();
    
    public StreetController(StreetService streetService) {
        this.streetService = streetService;
    }
    
    @GetMapping(value = "/{cityId}", produces = "application/json")
    @ResponseBody
    public List<StreetDto> getAllStreetByCityId(@PathVariable("cityId") Long cityId) throws ServiceException {
        List<StreetEntity> allByCityEntityId = streetService.findAllByCityEntityId(cityId);
        if (allByCityEntityId != null) {
            Type listType = new TypeToken<List<StreetDto>>() {
            }.getType();
            return modelMapper.map(allByCityEntityId, listType);
        }
        throw new ServiceException("There is no such City with the given Id: " + cityId);
    }
    
    @GetMapping(value = "/{cityId}/{streetId}", produces = "application/json")
    @ResponseBody
    public StreetDto getStreetDetailsByCityId(@PathVariable("cityId") Long cityId, @PathVariable("streetId") Long streetId) throws ServiceException {
        StreetEntity byIdAndCityEntityId = streetService.findByIdAndCityEntityId(cityId, streetId);
        if (byIdAndCityEntityId != null) {
            return modelMapper.map(byIdAndCityEntityId, StreetDto.class);
        }
        throw new ServiceException("There is no such Id combination, cityId: " + cityId + " " + " streetId: " + streetId);
    }
    
    @PostMapping(value = "/cities/{cityId}/streets", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public StreetEntity addStreet(@RequestBody StreetDto streetDto, @PathVariable("cityId") Long cityId) {
        return streetService.saveStreet(streetDto, cityId);
    }
}
