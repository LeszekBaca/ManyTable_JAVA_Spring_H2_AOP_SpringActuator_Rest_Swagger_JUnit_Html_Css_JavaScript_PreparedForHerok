package com.project.repository;

import com.project.model.ServiceAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Repository
public interface ServiceActionRepository extends JpaRepository<ServiceAction, Long> {

    @Transactional
    @Query(value = "select e from Service_action e where e.actionStartDate >=:actionStartDate and e.actionEndDate <= :actionEndDate ")
    List<ServiceAction> findServiceActionByBetweenDate(@Param("actionStartDate") Date actionStartDate, @Param("actionEndDate") Date actionEndDate);

    List<ServiceAction> findByIdComponent(Long id);


}
