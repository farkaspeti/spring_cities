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
    
    @GetMapping("/cities/population/city")
    public double getAveragePopulation(@RequestParam Long id) throws ServiceException {
        if (statService.populationInCity(id) != 0) {
            return statService.populationInCity(id);
        }
        throw new ServiceException("There is no City with this ID!");
    }
    
    @GetMapping("/cities/sum-population")
    public double getSumPopulation() throws ServiceException {
        if (statService.sumPopulation() != 0) {
            return statService.sumPopulation();
        }
        throw new ServiceException("There is no City with this ID!");
    }
}
