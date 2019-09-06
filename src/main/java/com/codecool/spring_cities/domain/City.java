package com.codecool.spring_cities.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;
    private Long population;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    List<Street> cityStreetList = new List<>();
}