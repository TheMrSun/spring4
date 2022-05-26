package com.aspectJ.aspectJ01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Slience
 * @version 1.0
 */
@Aspect
public class Audience2 {
    @Pointcut("execution(* com.aspectJ.aspectJ01.concert.Performance.perform(..))")
    public void perform2(){
    }

    @Around("perform2()")
    public void watchPerform(ProceedingJoinPoint jb){
        try {
            System.out.println("2.silencing cell phones");
            System.out.println("2.taking seats");
            jb.proceed();
            System.out.println("2.audience applause");
        } catch (Throwable throwable) {
            System.out.println("2.audiences say refund");
        }
    }
}
