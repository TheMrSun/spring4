package com.aop.BrowserAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Slience
 * @version 1.0
 */
public class BrowserAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        encrypt();
        Object retVal = methodInvocation.proceed();
        decrypt();
        return retVal;
    }

    private void encrypt(){
        System.out.println("encrypt 加密");
    }
    private void decrypt(){
        System.out.println("decrypt 解密");
    }
}
