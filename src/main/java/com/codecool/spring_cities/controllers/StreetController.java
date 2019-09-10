package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.services.StreetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author PETI
 * @see {@link http://google.com}
 */
@RestController
@RequestMapping("/streets")
public class StreetController {
    
    /**
     * Reference to a {@link StreetService} implementation.
     *
     * @see com.codecool.spring_cities.services.StreetServiceImpl
     */
    private final StreetService streetService;
    
    /**
     * Creates a new StreetController instance.
     *
     * @param streetService a reference to a {@link StreetService} implementation.
     */
    public StreetController(StreetService streetService) {
        this.streetService = streetService;
    }
    
    /**
     * asdasd
     *
     * @param cityId
     * @return
     */
    @GetMapping(value = "/{cityId}/street", produces = "application/json")
    @ResponseBody
    public List<StreetEntity> getAllStreetByCityId(@PathVariable("cityId") Long cityId) {
        return null;
    }
    
    @GetMapping(value = "/{cityId}/street/{streetId}", produces = "application/json")
    @ResponseBody
    public StreetEntity getStreetDetailsByCityId(@PathVariable("cityId") Long cityId, @PathVariable("streetId") Long streetId) {
        return null;
    }
    
    @PostMapping(value = "/cities/{cityId}/streets", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public StreetEntity addStreet(@PathVariable("cityId") Long cityId) {
        return null;
    }
}
