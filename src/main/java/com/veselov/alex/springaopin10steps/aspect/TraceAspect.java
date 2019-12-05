package com.veselov.alex.springaopin10steps.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TraceAspect {
    private static Logger LOGGER = LoggerFactory.getLogger(TraceAspect.class);

    @Around("execution(* com.veselov.alex.springaopin10steps.business.*.*(..))")
    public void before(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        point.proceed();
        long timeTaken = System.currentTimeMillis() - start;
        LOGGER.info("Hi, fFrom Aspect, I am 'AROND' intercept everything! '{}', Your time is -'{}'", point, timeTaken);
    }
}
