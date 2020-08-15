package com.project.repository;

import com.project.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComponentRepository extends JpaRepository<Component, Long> {


    @Query(value = "select max(id) from Component  ")
    Long MaxIdByComponent();

}