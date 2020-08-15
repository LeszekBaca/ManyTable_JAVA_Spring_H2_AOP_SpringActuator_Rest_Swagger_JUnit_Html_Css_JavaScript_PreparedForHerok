package com.project.controller;

import com.project.exception.NotFoundItemException;
import com.project.model.Warehouse;
import com.project.repository.WarehouseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/Warehouse")
public class WarehouseController {

    private static final Logger logger = LoggerFactory.getLogger(WarehouseController.class);

    @Autowired
    private WarehouseRepository warehouseRepository;

    //Get Warehouse by Id
    @GetMapping("/getWarehouseById/{id}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable("id") Long id) throws NotFoundItemException {
        Warehouse warehouse = warehouseRepository.findWarehouseById(id);
        logger.info("Warehouse id is: " + id);
        return new ResponseEntity<>(warehouse, HttpStatus.OK);
    }

    //Download all Warehouse objects
    @GetMapping("/getAllWarehouse")
    public ResponseEntity<List<Warehouse>> getAllWarehouse() {
        return new ResponseEntity<>(warehouseRepository.findAll(), HttpStatus.OK);

    }
}
