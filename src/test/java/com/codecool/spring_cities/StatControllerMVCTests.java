package com.codecool.spring_cities;

import com.codecool.spring_cities.controllers.StatController;
import com.codecool.spring_cities.entities.StatEntity;
import com.codecool.spring_cities.services.StatService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(StatController.class)
public class StatControllerMVCTests {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private StatService statService;
    
    @Test
    public void getAverageResidents() throws Exception {
        when(statService.averageResidents()).thenReturn((12.0));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/stats/houses/average-residents")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        verify(statService, times(1)).averageResidents();
    }
    /*
    @Test
    public void getAverageResidentsInCity() throws Exception {
        when(statService.averageResidentsInCity(1L)).thenReturn((12.0));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/stats/houses/average-residents/{id}",1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        verify(statService, times(1)).averageResidentsInCity(1L);
    }
    */
    @Test
    public void getAveragePopulation() throws Exception {
        when(statService.averagePopulation()).thenReturn((12.0));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/stats/cities/average-population")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        verify(statService, times(1)).averagePopulation();
    }
    
   /* @Test
    public void getAveragePopulationInCity() throws Exception {
        when(statService.populationInCity(1L)).thenReturn((int) 12.0);
        mockMvc.perform(MockMvcRequestBuilders
                .get("/stats/houses/average-population/{id}", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        verify(statService, times(1)).populationInCity(1L);
    }
    */
}
