package com.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;


@Entity(name = "Service_action")
public class ServiceAction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Action_name")
    private String actionName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Action_start_date")
    private Date actionStartDate;

    @Column(name = "Action_end_date")
    private Date actionEndDate;

    @Column(name = "Id_component")
    private Long idComponent;


    public ServiceAction() {
    }

    public ServiceAction(Long id, String actionName, Date actionStartDate, Date actionEndDate, Long idComponent) {
        this.id = id;
        this.actionName = actionName;
        this.actionStartDate = actionStartDate;
        this.actionEndDate = actionEndDate;
        this.idComponent = idComponent;
    }

    public ServiceAction(String actionName, Date actionStartDate, Date actionEndDate, Long idComponent) {
        this.actionName = actionName;
        this.actionStartDate = actionStartDate;
        this.actionEndDate = actionEndDate;
        this.idComponent = idComponent;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Date getActionStartDate() {
        return actionStartDate;
    }

    public void setActionStartDate(Date actionStartDate) {
        this.actionStartDate = actionStartDate;
    }

    public Date getActionEndDate() {
        return actionEndDate;
    }

    public void setActionEndDate(Date actionEndDate) {
        this.actionEndDate = actionEndDate;
    }

    public Long getIdComponent() {
        return idComponent;
    }

    public void setIdComponent(Long idComponent) {
        this.idComponent = idComponent;
    }

    @Override
    public String toString() {
        return "ServiceAction{" +
                "id=" + id +
                ", actionName='" + actionName + '\'' +
                ", actionStartDate=" + actionStartDate +
                ", actionEndDate=" + actionEndDate +
                ", idComponent=" + idComponent +
                '}';
    }

}
