package com.project.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @After("execution(* com.project.service.component.ComponentServiceImpl.getComponentById(..))")
    public void logGetComponentById(JoinPoint joinPoint) {
        System.out.println("****LoggingAspect.logGetComponentById() : " + joinPoint.getSignature().getName());
        System.out.println("****LoggingAspect.logGetComponentById() : className: " + joinPoint.getTarget().getClass().toString());
    }
    @After("execution(* com.project.service.service_action.ServiceActionImpl.addServiceAction(..))")
    public void logAddServiceAction(JoinPoint joinPoint) {
        System.out.println("****LoggingAspect.logAddServiceAction() : " + joinPoint.getSignature().getName());
        System.out.println("****LoggingAspect.logAddServiceAction() : className: " + joinPoint.getTarget().getClass().toString());
    }
    @After("execution(* com.project.service.warehouse.WarehouseServiceImpl.getWareHouseById(..))")
    public void logGetWareHouseById(JoinPoint joinPoint) {
        System.out.println("****LoggingAspect.logGetWareHouseById() : " + joinPoint.getSignature().getName());
        System.out.println("****LoggingAspect.logGetWareHouseById() : className: " + joinPoint.getTarget().getClass().toString());
    }
}