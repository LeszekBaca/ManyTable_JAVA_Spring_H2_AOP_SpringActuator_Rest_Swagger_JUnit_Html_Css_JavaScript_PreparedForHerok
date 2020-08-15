package com.project.repository;

import com.project.model.Car;
import com.project.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Transactional
    @Query(value = "select component from Component component, Car car where car.id=component.idCar and car.mark=:mark and car.model=:model")
    List<Component> findByMarkAndModel(@Param("mark") String mark, @Param("model") String model);
}

