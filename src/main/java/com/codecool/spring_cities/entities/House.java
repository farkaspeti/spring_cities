package com.codecool.spring_cities.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "houses")
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

