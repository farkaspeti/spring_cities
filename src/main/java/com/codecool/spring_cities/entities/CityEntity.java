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
@Table(name = "cities")
public class CityEntity extends AbstractEntity<Long> implements Serializable {
    
    private String cityName;
    private Long population;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cityEntity")
    List<StreetEntity> cityStreetEntityList = new ArrayList<>();
    
    @Builder
    public CityEntity(Long id, String cityName, Long population, List<StreetEntity> cityStreetEntityList) {
        super(id);
        this.cityName = cityName;
        this.population = population;
        this.cityStreetEntityList = cityStreetEntityList;
    }
}