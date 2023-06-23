package com.project.controller;


import com.project.model.ProductFeature;
import com.project.repository.ProductFeatureRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringJUnit4ClassRunner.class)
public class ProductFeatureControllerTest {


    @Mock
    ProductFeatureController productFeatureController;

    @Mock
    ProductFeatureRepository productFeatureRepository;


    @Test
    public void deleteProductFeatureTestWhenSalesArgumentIsPresent() {
        when(productFeatureRepository.deleteById(1L)).thenReturn(Boolean.TRUE);
        assertEquals(productFeatureController.deleteProductFeature(1L).getStatusCode(), HttpStatus.OK);
    }

}