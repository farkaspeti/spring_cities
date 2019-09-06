package com.codecool.spring_cities.repositories;

import com.codecool.spring_cities.domain.Street;
import org.springframework.data.repository.CrudRepository;

public interface StreetRepository extends CrudRepository<Street, Long> {
}
