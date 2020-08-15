package com.project.advice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {

    Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);

    @Pointcut(value = "execution(* com.project.*.*.*(..))")
    public void myPointcut() {

    }

    @Around("myPointcut()")
    public Object aplicationLogger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        ObjectMapper mapper = new ObjectMapper();
        String methodName = proceedingJoinPoint.getSignature().getName();
        String className = proceedingJoinPoint.getTarget().getClass().toString();
        Object[] array = proceedingJoinPoint.getArgs();
        logger.info("method invoke " + className + " : " + methodName + "()" + "arguments : " + mapper.writeValueAsString(array));
        Object object = proceedingJoinPoint.proceed();
        logger.info(className + " : " + methodName + "()" + " Responde : " + mapper.writeValueAsString(object));
        return object;
    }

}
