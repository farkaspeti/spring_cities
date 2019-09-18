package com.codecool.spring_cities.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository {
    
    @Query(value = "SELECT house_residents FROM houses;",
            countQuery = "SELECT avg(*) FROM houses", nativeQuery = true)
    double averageResidents();
    
    /*double averageResidentsInCity(Long cityId);
    
      double averagePopulationInCity(Long cityId);*/
}
