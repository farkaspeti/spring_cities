package com.codecool.spring_cities;


import com.codecool.spring_cities.controllers.CityController;
import com.codecool.spring_cities.controllers.StreetController;
import com.codecool.spring_cities.entities.StreetEntity;
import com.codecool.spring_cities.services.StreetService;
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
@WebMvcTest(StreetController.class)
public class StreetControllerMVCTests {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private StreetService streetService;
    
    
    @Test
    public void findAllByCityEntityId() throws Exception {
        when(streetService.findAllByCityEntityId(1L)).thenReturn(List.of(
                new StreetEntity(1L, "A", null, null)));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/streets/{id}", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").value(1));
        
        verify(streetService, times(1)).findAllByCityEntityId(1L);
    }
    
}
