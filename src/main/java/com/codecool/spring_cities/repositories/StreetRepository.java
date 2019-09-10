package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.StreetEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StreetRepository extends CrudRepository<StreetEntity, Long> {
    
    Set<StreetEntity> findAllBy_cityEntityId(long cityEntityId);
    
    StreetEntity findByIdAndCityEntityId(@Param("id") Long id, @Param("cityId") Long cityEntityId);
}
