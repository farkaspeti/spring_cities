package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.HouseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends CrudRepository<HouseEntity, Long> {
    
    List<HouseEntity> findByCityEntityId(Long cityId);
    
    HouseEntity findById(long houseId);
    
    HouseEntity save(HouseEntity houseEntity);
}
