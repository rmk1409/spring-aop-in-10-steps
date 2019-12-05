package com.veselov.alex.springaopin10steps.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
    private static Logger LOGGER = LoggerFactory.getLogger(BeforeAspect.class);

    // execution(* PACKAGE.*.*(..))
    @Before("execution(* com.veselov.alex.springaopin10steps.business.*.*(..))")
    public void before(JoinPoint point) {
        LOGGER.info("Hi, fFrom Aspect, I am 'BEFORE' intercept everything! '{}'", point);
    }

    @AfterReturning(value = "execution(* com.veselov.alex.springaopin10steps.data.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint point, Object result) {
        LOGGER.info("Hi, fFrom Aspect, I am 'AFTER_RETURNING' intercept everything! '{}' and return '{}'", point, result);
    }
}
