package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.domain.Street;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface StreetRepository extends CrudRepository<Street, Long> {
    
    Set<Street> findAllById(Long cityId);
}
