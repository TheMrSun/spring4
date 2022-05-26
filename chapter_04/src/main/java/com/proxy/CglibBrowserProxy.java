package com.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Slience
 * @version 1.0
 */
public class CglibBrowserProxy implements MethodInterceptor {

    public <T> T getProxy(Class<T> clazz){
        return (T) Enhancer.create(clazz, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        encrypt();
        Object retVal = methodProxy.invokeSuper(o, objects);
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
