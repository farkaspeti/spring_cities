package com.codecool.spring_cities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseDto implements Serializable {
    
    private Long id;
    private int houseResidents;
    private String houseNumber;
}
