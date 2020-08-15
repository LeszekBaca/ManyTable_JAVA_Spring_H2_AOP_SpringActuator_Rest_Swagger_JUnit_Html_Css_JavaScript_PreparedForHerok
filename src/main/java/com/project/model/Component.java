package com.project.model;

import javax.persistence.*;

@Entity(name = "Component")
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Component_name")
    private String componentName;

    @Column(name = "Description_component")
    private String descriptionComponent;

    @Column(name = "Component_price")
    private double componentPrice;

    @Column(name = "Id_warehouse")
    private Long idWarehiouse;

    @Column(name = "Id_car")
    private Long idCar;


    public Component() {
    }


    public Component(Long id, String componentName, String descriptionComponent, double componentPrice, Long idWarehiouse, Long idCar) {
        this.id = id;
        this.componentName = componentName;
        this.descriptionComponent = descriptionComponent;
        this.componentPrice = componentPrice;
        this.idWarehiouse = idWarehiouse;
        this.idCar = idCar;
    }

    public Component(String componentName, String descriptionComponent, double componentPrice, Long idWarehiouse, Long idCar) {
        this.componentName = componentName;
        this.descriptionComponent = descriptionComponent;
        this.componentPrice = componentPrice;
        this.idWarehiouse = idWarehiouse;
        this.idCar = idCar;
    }

    public Long getId(long l) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getDescriptionComponent() {
        return descriptionComponent;
    }

    public void setDescriptionComponent(String descripptionPrice) {
        this.descriptionComponent = descripptionPrice;
    }

    public double getComponentPrice() {
        return componentPrice;
    }

    public void setComponentPrice(double componentPrice) {
        this.componentPrice = componentPrice;
    }

    public Long getIdWarehiouse() {
        return idWarehiouse;
    }

    public void setIdWarehiouse(Long idWarehiouse) {
        this.idWarehiouse = idWarehiouse;
    }

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", componentName='" + componentName + '\'' +
                ", descriptionPrice='" + descriptionComponent + '\'' +
                ", componentPrice=" + componentPrice +
                ", idWarehiouse=" + idWarehiouse +
                ", idCar=" + idCar +
                '}';
    }

/*    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public List<ServiceAction> getServiceActions() {
        return serviceActions;
    }

    public void setServiceActions(List<ServiceAction> serviceActions) {
        this.serviceActions = serviceActions;
    }

    public void addServiceAction(ServiceAction serviceAction){
        if(serviceActions == null)
            serviceActions = new ArrayList<>();
        serviceActions.add(serviceAction);
        serviceAction.setComponent(this);
    }

    public List<SalesArgument> getSalesArguments() {
        return salesArguments;
    }

    public void setSalesArguments(List<SalesArgument> salesArguments) {
        this.salesArguments = salesArguments;
    }

    public void addSalesArgument(SalesArgument salesArgument){
        if(salesArguments == null)
            salesArguments = new ArrayList<>();
        salesArguments.add(salesArgument);
        salesArgument.setComponent(this);
    }*/
}

