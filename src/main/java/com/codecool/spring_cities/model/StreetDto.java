package com.codecool.spring_cities.model;

import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.entities.HouseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StreetDto implements Serializable {
    
    private String streetName;
    private List<HouseEntity> streetHouseEntities;
    private CityEntity cityEntity;
}
