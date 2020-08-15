package com.project.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.model.Component;
import com.project.repository.ComponentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ComponentControllerTest {

    private static final ObjectMapper om = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ComponentRepository componentRepository;

    @Before
    public void init() {
        Component component = new Component(1L, "PRZEPUSTNICA", "ORYGINALNA", 500.00, 1L, 1L);
        when(componentRepository.findById(1L)).thenReturn(Optional.of(component));
    }


    @Test
    public void updateComponentWhenComponentIsPresentTest() throws Exception {

        Component component = new Component(1L, "PRZEPUSTNICA", "ZAMIENNIK", 500.00, 1L, 1L);
        when(componentRepository.save(any(Component.class))).thenReturn(component);

        mockMvc.perform(put("/Component/changeDescription/1")
                .content(om.writeValueAsString(component))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    public void getAllComponentTest() throws Exception {

        List<Component> components = Arrays.asList(
                new Component(1L, "PRZEPUSTNICA", "ZAMIENNIK", 500.00, 1L, 1L),
                new Component(2L, "PRZEPUSTNICA", "ORYGINALNA", 500.00, 1L, 1L));

        when(componentRepository.findAll()).thenReturn(components);

        mockMvc.perform(get("/Component/getAllComponent"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        verify(componentRepository, times(1)).findAll();
    }


}
