package com.veselov.alex.springaopin10steps.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {
    @Pointcut("execution(* com.veselov.alex.springaopin10steps.business.*.*(..))")
    public void beforeBusinessLayerExecution() {
    }

    @Pointcut("execution(* com.veselov.alex.springaopin10steps.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.veselov.alex.springaopin10steps.aspect.JoinPointConfig.traceBusinessPerformanceExecution())")
    public void traceBusinessPerformanceExecution() {
    }
}
