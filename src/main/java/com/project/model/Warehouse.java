package com.project.model;

import javax.persistence.*;


@Entity(name = "Warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Component_availability")
    private Boolean componentAvailability;

    @Column(name = "Shipping_time")
    private int shippingTime;

    public Warehouse() {
    }

    public Warehouse(Long id, Boolean componentAvailability, int shippingTime, int idComponent) {
        this.id = id;
        this.componentAvailability = componentAvailability;
        this.shippingTime = shippingTime;
    }

    public Warehouse(Boolean BomponentAvailability, int shippingTime, int idComponent) {
        this.componentAvailability = componentAvailability;
        this.shippingTime = shippingTime;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isComponentAvailability() {
        return componentAvailability;
    }

    public void setComponentAvailability(Boolean componentAvailability) {
        this.componentAvailability = componentAvailability;
    }

    public int getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(int shippingTime) {
        this.shippingTime = shippingTime;
    }


    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", componentAvailability=" + componentAvailability +
                ", shippingTime=" + shippingTime +
                '}';
    }


}
