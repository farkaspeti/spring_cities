package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.model.Street;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StreetRepository extends CrudRepository<Street, Long> {
    
    @Query(value = "SELECT * FROM street where city_id = :id", nativeQuery = true)
    Set<Street> findAllByCityId( @Param("id") Long cityId);
}
