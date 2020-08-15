package com.project.model;

import javax.persistence.*;

@Entity(name = "Product_feature")
public class ProductFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;


    @Column(name = "Product_feature")
    private String productFeature;


    @Column(name = "Id_component")
    private Long idComponent;

    public ProductFeature() {
    }

    public ProductFeature(String productFeature, Long idComponent) {
        this.productFeature = productFeature;
        this.idComponent = idComponent;
    }

    public ProductFeature(Long id, String productFeature, Long idComponent) {
        this.id = id;
        this.productFeature = productFeature;
        this.idComponent = idComponent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(String salesArgument) {
        this.productFeature = salesArgument;
    }

    public Long getIdComponent() {
        return idComponent;
    }

    public void setIdComponent(Long idComponent) {
        this.idComponent = idComponent;
    }

    @Override
    public String toString() {
        return "ProductFeature{" +
                "id=" + id +
                ", productFeature='" + productFeature + '\'' +
                ", idComponent=" + idComponent +
                '}';
    }

}
