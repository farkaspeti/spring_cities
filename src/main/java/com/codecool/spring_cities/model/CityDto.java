package com.codecool.spring_cities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CityDto implements Serializable {
    
    private Long id;
    private String cityName;
    private Integer population;
    private List<StreetDto> streetEntities;
}
