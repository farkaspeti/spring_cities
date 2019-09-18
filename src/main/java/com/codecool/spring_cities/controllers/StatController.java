package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.exceptions.ServiceException;
import com.codecool.spring_cities.services.StatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stats")
public class StatController {
    
    private final StatService statService;
    
    public StatController(StatService statService) {
        this.statService = statService;
    }
    
    @GetMapping("/houses/average-residents")
    public double getAverageResidents() throws ServiceException {
        if (statService.averageResidents() != 0) {
            return statService.averageResidents();
        }
        throw new ServiceException("Something Went Wrong!");
    }
    
    @GetMapping("/houses/average-residents/city")
    public double getAverageResidentsInCity(@RequestParam Long id) throws ServiceException {
        if (statService.averageResidentsInCity(id) != 0) {
            return statService.averageResidentsInCity(id);
        }
        throw new ServiceException("There is no City with this ID");
    }
    
    @GetMapping("/cities/average-population")
    public double getAveragePopulation() throws ServiceException {
        if (statService.averagePopulation() != 0) {
            return statService.averagePopulation();
        }
        throw new ServiceException("Something Went Wrong!");
    }
    
    @GetMapping("/cities/average-population/city")
    public double getAveragePopulation(@RequestParam Long id) throws ServiceException {
        if (statService.averagePopulationInCity(id) != 0) {
            return statService.averagePopulationInCity(id);
        }
        throw new ServiceException("There is no City with this ID!");
    }
}
