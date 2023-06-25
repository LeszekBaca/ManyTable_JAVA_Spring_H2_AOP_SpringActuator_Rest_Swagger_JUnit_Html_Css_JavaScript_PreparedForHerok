package com.project.controller;


import com.project.model.Component;
import com.project.repository.CarRepository;
import com.project.repository.ComponentRepository;
import com.project.service.component.ComponentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path = "/Component")
public class ComponentController {

    private static final Logger logger = LoggerFactory.getLogger(ComponentController.class);

    @Autowired
    private ComponentRepository componentRepository;

    @Autowired
    private ComponentService componentService;

    @Autowired
    private CarRepository carRepository;

    //Changing the description of the part with the given id,
    @PutMapping("/changeDescription/{id}")
    public ResponseEntity<Component> updateComponent(@PathVariable Long id, @RequestBody Component component)
            {

        //Optional<Component> finderComponent = componentRepository.findById(id);
        if (!componentRepository.findById(id).isPresent()) {
            logger.error("Id " + id + " is not existed");
            return ResponseEntity.badRequest().build();
        } else {
            Component currentComponent = componentService.getComponentById(id);
            currentComponent.setDescriptionComponent(component.getDescriptionComponent());
            return ResponseEntity.ok(componentRepository.save(currentComponent));
        }

    }

    //Download all Component objects
    @GetMapping("/getAllComponent")
    public ResponseEntity<List<Component>> getAllComponent() {
        return new ResponseEntity<>(componentRepository.findAll(), HttpStatus.OK);
    }

}
