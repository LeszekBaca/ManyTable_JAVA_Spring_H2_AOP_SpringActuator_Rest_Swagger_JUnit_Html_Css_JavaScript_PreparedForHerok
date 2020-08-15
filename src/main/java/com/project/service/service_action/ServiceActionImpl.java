package com.project.service.service_action;

import com.project.model.ServiceAction;
import com.project.repository.ComponentRepository;
import com.project.repository.ServiceActionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceActionImpl implements ServiceActionService {

    private static final Logger logger = LoggerFactory.getLogger(ServiceActionImpl.class);

    @Autowired
    private ServiceActionRepository serviceActionRepository;

    @Autowired
    private ComponentRepository componentRepository;


    @Override
    public boolean addServiceAction(ServiceAction serviceAction) {
        System.out.println("Method boolean addServiceAction(ServiceAction serviceAction) called");
        List<ServiceAction> list = serviceActionRepository.findByIdComponent(serviceAction.getIdComponent());
        Long maxIdComponent = componentRepository.MaxIdByComponent();
        if (serviceAction.getIdComponent() > maxIdComponent || list.size() > 0) {
            serviceActionRepository.save(serviceAction);
            logger.info("Method 'boolean addServiceAction(ServiceAction serviceAction)' called and return " + true);
            return true;
        } else {
            logger.info("Method 'boolean addServiceAction(ServiceAction serviceAction)' called and return " + false);
            return false;
        }

    }


}

