package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.Street;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StreetRepository extends CrudRepository<Street, Long> {
    
    @Query(value = "SELECT * FROM street WHERE city_id = :id", nativeQuery = true)
    Set<Street> findAllByCityId(@Param("id") Long cityId);
    
    @Query(value = "SELECT * FROM street WHERE id = :id AND city_id =:cityId", nativeQuery = true)
    Street getStreetDetails(@Param("id") Long id,@Param("cityId") Long cityId);
}
