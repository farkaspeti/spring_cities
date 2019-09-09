package com.codecool.spring_cities.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Street {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "street")
    private List<House> streetHouses = new ArrayList<>();
    
    @OneToOne
    private City city;
}
