package com.codecool.spring_cities.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class House {
    
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

