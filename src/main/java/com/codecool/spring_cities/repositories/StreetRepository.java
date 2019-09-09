package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.StreetEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StreetRepository extends CrudRepository<StreetEntity, Long> {
    
    @Query(value = "SELECT * FROM streets WHERE city_id = :id", nativeQuery = true)
    Set<StreetEntity> findAllByCityId(@Param("id") Long cityId);
    
    @Query(value = "SELECT * FROM streets WHERE id = :id AND city_id =:cityId", nativeQuery = true)
    StreetEntity getStreetDetails(@Param("id") Long id, @Param("cityId") Long cityId);
}
