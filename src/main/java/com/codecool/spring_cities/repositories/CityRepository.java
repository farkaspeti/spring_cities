package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends CrudRepository<CityEntity, Long> {
    
    CityEntity findById(long cityId);
    
    CityEntity save(CityEntity cityEntity);
    
}
