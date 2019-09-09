package com.codecool.spring_cities.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class House implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    private City city;
    
    @OneToOne
    private Street street;
    private int houseResidents;
    private String houseNumber;
}

