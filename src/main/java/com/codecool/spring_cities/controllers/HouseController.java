package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.model.HouseDto;
import com.codecool.spring_cities.services.HouseService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/houses")
public class HouseController {
    
    private final HouseService houseService;
    private final ModelMapper modelMapper = new ModelMapper();
    
    HouseController(HouseService houseService) {
        this.houseService = houseService;
    }
    
    @GetMapping(value = "/cities/{id}", produces = "application/json")
    @ResponseBody
    public List<HouseDto> getHousesByCityId(@PathVariable("id") Long id) throws ServiceException {
        List<HouseEntity> byCityEntityId = houseService.findByCityEntityId(id);
        if (byCityEntityId != null) {
            Type listType = new TypeToken<List<HouseDto>>() {
            }.getType();
            return modelMapper.map(byCityEntityId, listType);
        }
        throw new ServiceException("There is no such City with the given Id: " + id);
    }
    
    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public HouseDto getHouseById(@PathVariable("id") Long id) throws ServiceException {
        HouseEntity houseById = houseService.findHouseById(id);
        if (houseById != null) {
            return modelMapper.map(houseById, HouseDto.class);
        }
        throw new ServiceException("There is no such House with the given Id: " + id);
    }
    
    @PostMapping(value = "/houses", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public HouseEntity addHouse(@RequestBody HouseDto houseDto) {
        return houseService.saveHouse(houseDto);
    }
}
