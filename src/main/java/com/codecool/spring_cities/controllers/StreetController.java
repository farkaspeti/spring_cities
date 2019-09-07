package com.codecool.spring_cities.controllers;

import com.codecool.spring_cities.model.Street;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/streets")
public class StreetController {

    @GetMapping("/{cityId}/street/{streetId}")
    public Street getAllStreetByCityId(@PathVariable("cityId") Long cityId, @PathVariable("streetId") Long streetId) {
        return null;
    }
}
