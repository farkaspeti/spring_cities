package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.domain.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
}
