package com.codecool.spring_cities.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
public class Street {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "street")
    private List<Houses> streetHouses = new ArrayList<>();
}
