package com.springAop.springAop01;

import org.aspectj.lang.annotation.*;

/**
 * @author Slience
 * @version 1.0
 */
@Aspect
public class Audience {
    @Pointcut("execution(* com.springAop.springAop01.concert.MagicPerform.perform(..))")
    public void perform1(){
    }
    @Before("perform1()")
    public void silenceCellPhones(){
        System.out.println("1.silencing cell phones");
    }
    @Before("perform1()")
    public void takeSeats(){
        System.out.println("1.taking seats");
    }
    @AfterReturning("perform1()")
    public void applause(){
        System.out.println("1.audience applause");
    }
    @AfterThrowing("perform1()")
    public void demandRefund(){
        System.out.println("1.audiences say refund");
    }

}
