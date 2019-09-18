package com.codecool.spring_cities.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "statistics")
public class StatEntity extends AbstractEntity<Long> implements Serializable {
    
    private double statistics;
    
}
