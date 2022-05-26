package com.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Slience
 * @version 1.0
 * cglib 引入增强
 */
public class CglibIntroductionBrowserProxy implements MethodInterceptor,Game {

    public <T> T getProxy(Class<T> clazz){
        return (T) Enhancer.create(clazz,new Class[] {Game.class}, this);
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object retVal;
        if(method.getDeclaringClass().isInterface()){
            method.setAccessible(true);
            retVal = method.invoke(this, objects);
        } else{
            retVal = methodProxy.invokeSuper(o,objects);
        }
        return retVal;
    }

    @Override
    public void start() {
        System.out.println("start Game");
    }

}
