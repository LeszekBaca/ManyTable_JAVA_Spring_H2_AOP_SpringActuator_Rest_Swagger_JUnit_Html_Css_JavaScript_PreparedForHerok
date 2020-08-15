package com.project.repository;

import com.project.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {

    @Query(value = "select e from Warehouse e where e.id = ?1 ")
    Warehouse findWarehouseById(Long id);


}