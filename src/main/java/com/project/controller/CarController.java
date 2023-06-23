package com.project.controller;

import com.project.model.Car;
import com.project.model.Component;
import com.project.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/Car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    //Retrieve the Component object using the Mark and Model object Car fields
    @GetMapping("/getListDataBaseOnMarkAndModel/{mark}/{model}")
    public ResponseEntity<List<Component>> getListDataBasenOnMarkAndModel(@PathVariable("mark") String mark,
                                                                          @PathVariable("model") String model) {
        return new ResponseEntity<>(carRepository.findByMarkAndModel(mark.toUpperCase(), model.toUpperCase()), HttpStatus.OK);

    }



    //Download all Car objects
    @GetMapping("/getAllCar")
    public ResponseEntity<List<Car>> getAllCar() {
        return new ResponseEntity<>(carRepository.findAll(), HttpStatus.OK);


    }
}


