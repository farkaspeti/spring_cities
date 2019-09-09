package com.codecool.spring_cities.entities;

import lombok.Builder;
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
public class StreetEntity extends AbstractEntity<Long> implements Serializable {
    
    private String streetName;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "streetEntity")
    private List<HouseEntity> streetHouseEntities = new ArrayList<>();
    
    @OneToOne
    private CityEntity cityEntity;
    
    @Builder
    public StreetEntity(Long id, String streetName, List<HouseEntity> streetHouseEntities, CityEntity cityEntity) {
        super(id);
        this.streetName = streetName;
        this.streetHouseEntities = streetHouseEntities;
        this.cityEntity = cityEntity;
        
    }
}
