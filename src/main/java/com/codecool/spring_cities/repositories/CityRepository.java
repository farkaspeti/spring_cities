package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends CrudRepository<CityEntity, Long> {
    
    Optional<CityEntity> findById(Long cityId);
    
    CityEntity save(CityEntity cityEntity);
}
