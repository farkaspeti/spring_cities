package com.codecool.spring_cities.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "streets")
public class Street implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "street")
    private List<House> streetHouses = new ArrayList<>();
    
    @OneToOne
    private City city;
}
