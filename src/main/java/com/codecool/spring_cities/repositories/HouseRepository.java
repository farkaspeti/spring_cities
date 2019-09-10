package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.HouseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HouseRepository extends CrudRepository<HouseEntity, Long> {
    
    Optional<HouseEntity> findById(@Param("id") Long cityId);
}
