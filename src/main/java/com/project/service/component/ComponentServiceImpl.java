package com.project.service.component;


import com.project.model.Component;
import com.project.repository.ComponentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ComponentServiceImpl implements ComponentService {

    private static final Logger logger = LoggerFactory.getLogger(ComponentServiceImpl.class);

    @Autowired
    private ComponentRepository componentRepository;


    @Override
    public Component getComponentById(Long id) {
        logger.info("Method: 'Component getComponentById(Long id)' called and return " + componentRepository.findById(id).get());
        return componentRepository.findById(id).get();
    }


}


