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
        double averageResidents = statService.averageResidents();
        if (averageResidents != 0) {
            return averageResidents;
            
        }
        throw new ServiceException("Something Went Wrong!");
    }
    
    @GetMapping("/houses/average-residents/city")
    public double getAverageResidentsInCity(@RequestParam Long id) throws ServiceException {
        double averageResidentsInCity = statService.averageResidentsInCity(id);
        if (averageResidentsInCity != 0) {
            return averageResidentsInCity;
        }
        throw new ServiceException("There is no City with this ID");
    }
    
    @GetMapping("/cities/average-population")
    public double getAveragePopulation() throws ServiceException {
        double averagePopulation = statService.averagePopulation();
        if (averagePopulation != 0) {
            return averagePopulation;
        }
        throw new ServiceException("Something Went Wrong!");
    }
    
    @GetMapping("/cities/population/city")
    public double getAveragePopulation(@RequestParam Long id) throws ServiceException {
        int populationInCity = statService.populationInCity(id);
        if (populationInCity != 0) {
            return populationInCity;
        }
        throw new ServiceException("There is no City with this ID!");
    }
    
    @GetMapping("/cities/sum-population")
    public double getSumPopulation() throws ServiceException {
        int sumPopulation = statService.sumPopulation();
        if (sumPopulation != 0) {
            return sumPopulation;
        }
        throw new ServiceException("There is no City with this ID!");
    }
}
