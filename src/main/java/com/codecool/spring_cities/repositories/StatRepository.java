package com.codecool.spring_cities.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository {
    
    @Query(value = "SELECT HOUSE_RESIDENTS FROM HOUSES;",
            countQuery = "SELECT avg(*) FROM HOUSES", nativeQuery = true)
    double averageResidents();
    
    //double averageResidentsInCity(Long cityId);
    
  //double averagePopulationInCity(Long cityId);
}
