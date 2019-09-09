package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.House;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House, Long> {
    @Query(value = "SELECT * FROM house WHERE city_id = :id", nativeQuery = true)
    House getHouseByCityId(@Param("id") Long cityId);
}
