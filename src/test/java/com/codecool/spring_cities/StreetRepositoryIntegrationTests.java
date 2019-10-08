package com.codecool.spring_cities;

import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.repositories.StreetRepository;
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
public class StreetRepositoryIntegrationTests {
    
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private StreetRepository streetRepository;
    
    @Test
    public void whenFindById_thenReturnStreet() {
        
        // given
        List<HouseEntity> houses = new ArrayList<>();
        CityEntity city = new CityEntity();
        StreetEntity testStreet = new StreetEntity("TestStreet", houses, city);
        entityManager.persist(testStreet);
        entityManager.flush();
        
        // when
        Optional<StreetEntity> optionalStreetEntity = streetRepository.findById(testStreet.getId());
        StreetEntity found = optionalStreetEntity.get();
        // then
        assertThat(found.getId())
                .isEqualTo(testStreet.getId());
    }
}
