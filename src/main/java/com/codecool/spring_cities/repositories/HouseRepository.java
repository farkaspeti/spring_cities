package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.HouseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HouseRepository extends CrudRepository<HouseEntity, Long> {
    
    Optional<HouseEntity> findById(Long cityId);
}
