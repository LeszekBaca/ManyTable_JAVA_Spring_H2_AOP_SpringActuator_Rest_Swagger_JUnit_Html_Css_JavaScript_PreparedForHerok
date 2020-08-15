package com.project.controller;


import com.project.model.Warehouse;
import com.project.repository.WarehouseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class WarehouseControllerTest {

    @InjectMocks
    WarehouseController warehouseController;

    @Mock
    WarehouseRepository warehouseRepository;

    @Mock
    Warehouse warehouse;

    @Test
    public void getWarehouseByIdTest() {
        when(warehouseRepository.findById(1L)).thenReturn(java.util.Optional.of(warehouse));
        assertEquals(warehouseController.getWarehouseById(1L).getStatusCode(), HttpStatus.OK);
    }

}
