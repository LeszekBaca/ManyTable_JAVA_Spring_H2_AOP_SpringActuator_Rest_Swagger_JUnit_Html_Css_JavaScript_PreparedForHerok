package com.project.model;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private String model;

    @Column(name = "production_date_start")
    private Date productionDateStart;

    @Column(name = "production_date_end")
    private Date productionDateEnd;


    public Car() {
    }

    public Car(Long id, String mark, String model, Date productionDateStart, Date productionDateEnd) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.productionDateStart = productionDateStart;
        this.productionDateEnd = productionDateEnd;
    }

    public Car(String mark, String model, Date productionDateStart, Date productionDateEnd) {
        this.mark = mark;
        this.model = model;
        this.productionDateStart = productionDateStart;
        this.productionDateEnd = productionDateEnd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionDateStart() {
        return productionDateStart;
    }

    public void setProductionDateStart(Date productionDateStart) {
        this.productionDateStart = productionDateStart;
    }

    public Date getProductionDateEnd() {
        return productionDateEnd;
    }

    public void setProductionDateEnd(Date productionDateEnd) {
        this.productionDateEnd = productionDateEnd;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", productionDateStart=" + productionDateStart +
                ", productionDateEnd=" + productionDateEnd +
                '}';
    }

/*    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }*/

/*    public void addComponent(Component component){
        if(components == null)
            components = new ArrayList<>();
        components.add(component);
        component.setCar(this);
    }*/

}
