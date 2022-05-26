package com.springAop.springAopXml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author Slience
 * @version 1.0
 */
@Aspect
public class Audience {
    public void silenceCellPhones(){
        System.out.println("1.silencing cell phones");
    }

    public void takeSeats(){
        System.out.println("1.taking seats");
    }
    public void applause(){
        System.out.println("1.audience applause");
    }

    public void demandRefund(){
        System.out.println("1.audiences say refund");
    }

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
