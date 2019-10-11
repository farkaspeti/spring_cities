package com.codecool.spring_cities;

import com.codecool.spring_cities.controllers.HouseController;
import com.codecool.spring_cities.entities.HouseEntity;
import com.codecool.spring_cities.services.HouseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HouseController.class)
public class HouseControllerMVCTests {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private HouseService houseService;
    
    
    @Test
    public void findHousesByCityId() throws Exception {
        
        when(houseService.findByCityEntityId(1L))
                .thenReturn(List.of(
                        new HouseEntity(1L,null, null, 23, "A/11")));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/houses/cities/{id}", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].id").value(1));
        
        verify(houseService, times(1)).findByCityEntityId(1L);
    }
    
    @Test
    public void getHousesById() throws Exception {
        
        when(houseService.findHouseById(1L))
                .thenReturn((new HouseEntity(1L,null, null, 23, "A/11")));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/houses/{id}", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
        
        verify(houseService, times(1)).findHouseById(1);
    }
}
