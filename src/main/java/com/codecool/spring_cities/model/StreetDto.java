package com.codecool.spring_cities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StreetDto implements Serializable {
    
    private Long id;
    private String streetName;
    private List<HouseDto> houseEntities;
    
}
