package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.HouseEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<HouseEntity, Long> {
    @Query(value = "SELECT * FROM houses WHERE city_id = :id", nativeQuery = true)
    HouseEntity getHouseByCityId(@Param("id") Long cityId);
}
