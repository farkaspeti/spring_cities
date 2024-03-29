package com.codecool.spring_cities.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "houses")
public class HouseEntity extends AbstractEntity<Long> implements Serializable {
    
    @OneToOne
    private CityEntity cityEntity;
    
    @OneToOne
    private StreetEntity streetEntity;
    private int houseResidents;
    private String houseNumber;
    
    @Builder
    public HouseEntity(Long id, CityEntity cityEntity, StreetEntity streetEntity, int houseResidents, String houseNumber) {
        super(id);
        this.houseResidents = houseResidents;
        this.houseNumber = houseNumber;
    }
    
    public HouseEntity(CityEntity monaco, StreetEntity street, int i, String s) {
    }
}

