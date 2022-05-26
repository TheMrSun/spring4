package com.springAop.springAopExtraFunction;

/**
 * @author Slience
 * @version 1.0
 */
public class Human implements Animal {
    @Override
    public void sleep() {
        System.out.println("Human 实现 sleep()");
    }
}
