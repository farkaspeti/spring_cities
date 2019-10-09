package com.codecool.spring_cities;

import com.codecool.spring_cities.controllers.CityController;
import com.codecool.spring_cities.entities.CityEntity;
import com.codecool.spring_cities.services.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CityController.class)
public class CityEntityMVCTests {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private CityService cityService;
    
    @Test
    public void getAllCities() throws Exception {
        when(cityService.getCities()).thenReturn(List.of(
                new CityEntity(1L, "A", 100L, null),
                new CityEntity(2L, "B", 1001L, null),
                new CityEntity(3L, "C", 111L, null)
        ));
        
        mockMvc.perform(MockMvcRequestBuilders
                .get("/cities")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.[*].population").isNotEmpty());
        
        verify(cityService, times(1)).getCities();
    }
    
    @Test
    public void getCityById() throws Exception {
        
        when(cityService.findCityById(1)).thenReturn((new CityEntity(1L, "A", 100L, null)));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/cities/{id}", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
        
        verify(cityService, times(1)).getCities();
    }
}