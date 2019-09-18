package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.StatEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository extends CrudRepository<StatEntity, Long>{
    
    @Query(value = "SELECT AVG(HOUSE_RESIDENTS) FROM HOUSES",nativeQuery = true)
    double averageResidents();
    
    @Query(value = "SELECT AVG(HOUSE_RESIDENTS) FROM HOUSES WHERE CITY_ENTITY_ID =?",nativeQuery = true)
    double averageResidentsInCity(Long cityId);
    
    @Query(value = "SELECT SUM(HOUSE_RESIDENTS) FROM HOUSES",nativeQuery = true)
    double averagePopulationInCity(Long cityId);
}
