package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.StreetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StreetRepository extends CrudRepository<StreetEntity, Long> {
    
    Set<StreetEntity> findAllBycityEntityId(long cityEntityId);
    
    StreetEntity findByIdAndCityEntityId(Long id, Long cityEntityId);
}
