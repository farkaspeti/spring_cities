package com.codecool.spring_cities;

import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.repositories.CityRepository;
import com.codecool.spring_cities.entities.CityEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CityRepositoryIntegrationTests {
    
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private CityRepository cityRepository;
    
    
    @Test
    public void whenFindById_thenReturnCity() {
        
        // given
        List<StreetEntity> streets = new ArrayList<>();
        CityEntity monaco = new CityEntity("Monaco", (long) 433242, streets);
        entityManager.persist(monaco);
        entityManager.flush();
        
        // when
        Optional<CityEntity> optionalCityEntity = cityRepository.findById(monaco.getId());
        CityEntity found = optionalCityEntity.get();
        
        // then
        assertThat(found.getId())
                .isEqualTo(monaco.getId());
    }
}
