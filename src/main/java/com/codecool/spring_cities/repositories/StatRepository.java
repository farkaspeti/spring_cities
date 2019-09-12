package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.model.StatDto;
import org.springframework.data.repository.CrudRepository;

public interface StatRepository extends CrudRepository<StatDto, Long> {
}
