package com.project.service.warehouse;

import com.project.model.Warehouse;
import com.project.repository.WarehouseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WarehouseServiceImpl implements WarehouseService {

    private static final Logger logger = LoggerFactory.getLogger(WarehouseServiceImpl.class);

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public Warehouse getWareHouseById(Long id) {
        Warehouse obj = (Warehouse) warehouseRepository.findWarehouseById(id);
        logger.info("Method 'Warehouse getWareHouseById(Long id)' called and return " + obj);
        return obj;
    }
}
