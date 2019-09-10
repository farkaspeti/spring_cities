package com.codecool.spring_cities.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    public HouseEntity(Long id, CityEntity cityEntity, StreetEntity streetEntity,int houseResidents, String houseNumber) {
        super(id);
        this.cityEntity = cityEntity;
        this.streetEntity = streetEntity;
        this.houseResidents = houseResidents;
        this.houseNumber = houseNumber;
    }
}

