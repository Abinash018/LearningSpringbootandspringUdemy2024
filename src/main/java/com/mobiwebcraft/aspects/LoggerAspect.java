package com.mobiwebcraft.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());



    @Around("execution (* com.example.service.*.*(..))")
    public void log (ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() +"method execution start ");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish= Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute , method  : " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() +"method execution end ");

    }


    @AfterThrowing(value = "execution(* com.example.services.*.*(..))",throwing = "ex")
    public void logException(JoinPoint joinPoint ,Exception ex){
        logger.log(Level.SEVERE,joinPoint.getSignature()+"An exception thrown with the help of" +"@After Throwing which happened due to :"+ex.getMessage());

    }
    @AfterReturning(value = "execution.service.*.*(..)",returning="retVal")
    public void logStatus (JoinPoint joinPoint,Object retVal){
        logger.info(joinPoint.getSignature().toString() +"method execution end ");
    }


}
