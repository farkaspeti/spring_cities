package com.codecool.spring_cities.model;

import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.entities.StreetEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseDto implements Serializable {
    
    private CityEntity cityEntity;
    private StreetEntity streetEntity;
    private int houseResidents;
    private String houseNumber;
}
