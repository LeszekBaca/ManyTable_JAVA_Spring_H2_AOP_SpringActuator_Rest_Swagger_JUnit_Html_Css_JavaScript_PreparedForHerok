package com.project.controller;


import com.project.model.ServiceAction;
import com.project.repository.ServiceActionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceActionControllerTest {

    @InjectMocks
    ServiceActionController serviceActionController;

    @Mock
    ServiceActionRepository serviceActionRepository;

    @Mock
    ServiceAction serviceAction;


    @Test
    public void getAllServiceActionTest() {

        List<ServiceAction> serviceActionList = new ArrayList<>();
        serviceActionList.add(serviceAction);

        when(serviceActionRepository.findAll()).thenReturn(serviceActionList);
        assertEquals(serviceActionController.getAllServiceAction().getBody().size(), serviceActionList.size());

    }


}

