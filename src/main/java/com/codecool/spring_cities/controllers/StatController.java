package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.services.StatService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatController {
    
    private final StatService statService;
    private final ModelMapper modelMapper = new ModelMapper();
    
    public StatController(StatService statService) {
        this.statService = statService;
    }
    
    @GetMapping("/houses/average-residents")
    public double getAverageResidents() throws ServiceException {
        if(statService.averageResidents() != 0) {
            return statService.averageResidents();
        }
        throw new ServiceException("Something Went Wrong!");
    }
    
}
