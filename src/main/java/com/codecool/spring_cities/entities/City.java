package com.codecool.spring_cities.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class City implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;
    private Long population;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    List<Street> cityStreetList = new ArrayList<>();
}