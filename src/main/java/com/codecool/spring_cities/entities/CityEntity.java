package com.codecool.spring_cities.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Integer population;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cityEntity")
    List<StreetEntity> streetEntities = new ArrayList<>();
    
    @Builder
    public CityEntity(Long id, String cityName, Integer population, List<StreetEntity> streetEntities) {
        super(id);
        this.cityName = cityName;
        this.population = population;
        this.streetEntities = streetEntities;
    }
    
    public CityEntity(String cityName, Integer population, List<StreetEntity> streetEntities) {
        this.cityName = cityName;
        this.population = population;
        this.streetEntities = streetEntities;
    }
}