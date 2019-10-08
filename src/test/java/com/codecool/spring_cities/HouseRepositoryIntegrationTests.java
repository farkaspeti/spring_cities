package com.codecool.spring_cities;

import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.repositories.HouseRepository;
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
public class HouseRepositoryIntegrationTests {
    
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private HouseRepository houseRepository;
    
    @Test
    public void whenFindById_thenReturnHouse() {
        
        // given
        List<StreetEntity> streets = new ArrayList<>();
        StreetEntity street = new StreetEntity();
        CityEntity monaco = new CityEntity("Monaco", (long) 433242, streets);
        HouseEntity testHouse = new HouseEntity(monaco,street,5,"13/2");
        entityManager.persist(testHouse);
        entityManager.flush();
        
        // when
        Optional<HouseEntity> optionalHouseEntity = houseRepository.findById(testHouse.getId());
        HouseEntity found = optionalHouseEntity.get();
        
        // then
        assertThat(found.getId())
                .isEqualTo(testHouse.getId());
    }
}
