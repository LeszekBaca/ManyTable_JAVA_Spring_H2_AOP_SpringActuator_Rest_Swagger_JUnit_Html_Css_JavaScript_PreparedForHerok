
package com.project;

import com.project.controller.ServiceActionController;
import com.project.model.ServiceAction;
import com.project.service.service_action.ServiceActionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceActionTest {

    @InjectMocks
    ServiceActionController serviceActionController;

    @Mock
    ServiceActionService serviceActionService;

    @Mock
    ServiceAction serviceAction;


    @Test
    public void addServiceActionTest() {
        when(serviceActionService.addServiceAction(serviceAction)).thenReturn(true);
        assertEquals(serviceActionController.addServiceAction(serviceAction).getStatusCode(), HttpStatus.CREATED);

    }

}




