package com.aop.BrowserAop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Slience
 * @version 1.0
 */
public class BrowserBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        encrypt();
    }
    private void encrypt(){
        System.out.println("encrypt 加密");
    }
}
