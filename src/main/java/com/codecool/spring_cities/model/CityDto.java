package com.codecool.spring_cities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto implements Serializable {
    
    private Long id;
    private String cityName;
    private Long population;
    private List<StreetDto> streetEntities;
}
