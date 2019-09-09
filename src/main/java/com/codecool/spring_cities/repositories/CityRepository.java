package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.CityEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<CityEntity, Long> {
    
    @Query(value = "SELECT * FROM cities WHERE id = :id", nativeQuery = true)
    CityEntity getCity(@Param("id") Long cityId);
    
    //City saveCity(City city);
}
