package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.entities.StreetEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetRepository extends CrudRepository<StreetEntity, Long> {
    
    List<StreetEntity> findAllByCityEntityId(Long cityEntityId);
    
    StreetEntity findByIdAndCityEntityId(Long id, Long cityEntityId);
    
    //StreetEntity saveByCityEntityId(StreetEntity streetEntity,Long cityEntityId);
    
}
