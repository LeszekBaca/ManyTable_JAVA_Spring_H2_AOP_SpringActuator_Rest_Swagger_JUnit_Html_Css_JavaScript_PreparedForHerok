package com.project.controller;

import com.project.model.ServiceAction;
import com.project.repository.ServiceActionRepository;
import com.project.service.service_action.ServiceActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping(path = "/ServiceAction/")
public class ServiceActionController {

    private static final Logger logger = LoggerFactory.getLogger(ServiceActionController.class);

    @Autowired

    private ServiceActionService serviceActionService;

    @Autowired
    private ServiceActionRepository serviceActionRepository;

    //Adding a service action to the part with given id,
    @PostMapping("/addServiceAction")
    public ResponseEntity<Void> addServiceAction(@RequestBody ServiceAction serviceAction) {
        if (serviceActionService.addServiceAction(serviceAction)) {
            logger.info("Service Action was added");
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    //Download all ServiceAction objects
    @GetMapping("/getAllServiceAction")
    public ResponseEntity<List<ServiceAction>> getAllServiceAction() {
        return new ResponseEntity<>(serviceActionRepository.findAll(), HttpStatus.OK);

    }

    //Get ServiceAction by
    @GetMapping("/dataBetween/{actionStartDate}/{actionEndDate}")
    public ResponseEntity<List<ServiceAction>> findServiceActionByBeatweenDate(
            @PathVariable("actionStartDate") Date actionStartDate, @PathVariable("actionEndDate") Date actionEndDate) {
        return new ResponseEntity<>(serviceActionRepository.findServiceActionByBeatweenDate(actionStartDate, actionEndDate), HttpStatus.OK);


    }

}
