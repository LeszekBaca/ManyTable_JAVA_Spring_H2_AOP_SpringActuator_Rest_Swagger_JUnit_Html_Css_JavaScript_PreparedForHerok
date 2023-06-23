package com.project.controller;

import com.project.model.ProductFeature;
import com.project.repository.ProductFeatureRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/ProductFeature")
public class ProductFeatureController {

    private static final Logger logger = LoggerFactory.getLogger(ProductFeatureController.class);

    @Autowired
    private ProductFeatureRepository productFeatureRepository;

    //deleting a single entry
    @DeleteMapping("/deleteProductFeature/{id}")
    public ResponseEntity<HttpStatus> deleteProductFeature(@PathVariable("id") long id) {

        if (productFeatureRepository.findById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            productFeatureRepository.deleteProductFeature(id);
            logger.info("Product feature is delete");
            return new ResponseEntity<>(HttpStatus.OK);

        }
    }

    //Get all ProductFeature object
    @GetMapping("/getAllProductFeature")
    public ResponseEntity<List<ProductFeature>> findAllProductFeatureControler() {
        return new ResponseEntity<List<ProductFeature>>(productFeatureRepository.findAll(), HttpStatus.OK);

    }

}