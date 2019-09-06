package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.domain.House;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends CrudRepository<House, Long> {
}
