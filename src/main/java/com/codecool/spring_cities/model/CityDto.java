package com.codecool.spring_cities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto implements Serializable {
    
    private String cityName;
    private Long population;

}
