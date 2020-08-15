package com.project.repository;

import com.project.model.ProductFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ProductFeatureRepository extends JpaRepository<ProductFeature, Long> {

    @Modifying
    @Transactional
    @Query(value = "delete from Product_feature e where e.idComponent = :component ")
    void deleteProductFeature(@Param("component") Long component);

    Boolean deleteById(long id);


}
