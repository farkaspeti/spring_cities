package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    
    @Query(value = "SELECT * FROM city WHERE id = :id", nativeQuery = true)
    City getCity(@Param("id") Long cityId);
    
    City saveCity(City city);
}
