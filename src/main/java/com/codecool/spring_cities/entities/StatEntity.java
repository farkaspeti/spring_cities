package com.codecool.spring_cities.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "results")
public class StatEntity extends AbstractEntity<Long> implements Serializable {
    
    private double results;
    
    @Builder
    public StatEntity(Long id, double results) {
        super(id);
        this.results = results;
    }
}
