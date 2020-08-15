package com.project.controller;

import com.project.model.Car;
import com.project.repository.CarRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    CarRepository carRepository;

    @Before
    public void init() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String date1 = "2020-01-01";
        String date2 = "2020-10-01";
        java.sql.Date sqlDate1 = java.sql.Date.valueOf(date1);
        java.sql.Date sqlDate2 = java.sql.Date.valueOf(date2);

        Car car = new Car(1L, "BMW", "320", sqlDate1, sqlDate2);
        when(carRepository.findById(1L)).thenReturn(Optional.of(car));
    }


    @Test
    public void getAllCarTest() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String date1 = "2020-01-01";
        String date2 = "2020-10-01";

        java.sql.Date sqlDate1 = java.sql.Date.valueOf(date1);
        java.sql.Date sqlDate2 = java.sql.Date.valueOf(date2);

        List<Car> carList = Arrays.asList(
                new Car(1L, "MAZDA", "3", sqlDate1, sqlDate2),
                new Car(2L, "AUDI", "A3", sqlDate1, sqlDate2));

        when(carRepository.findAll()).thenReturn(carList);

        mockMvc.perform(get("/Car/getAllCar"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        verify(carRepository, times(1)).findAll();
    }


}
