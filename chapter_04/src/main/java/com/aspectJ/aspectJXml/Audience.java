package com.aspectJ.aspectJXml;

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

}
