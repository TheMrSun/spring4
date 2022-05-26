package com.proxy;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Slience
 * @version 1.0
 *
 * jdk动态代理缺点：只能代理接口中的方法，如果代理对象没有实现接口，或着想要代理不在接口中的方法
 * jdk动态代理无法实现,这时需要就需要 CGLIB 动态代理。
 */
public class JdkBrowserProxy implements InvocationHandler {

    private Browser browser;
    @Autowired
    public JdkBrowserProxy(Browser browser) {
        this.browser = browser;
    }

    public Browser getProxy(){
        return (Browser)Proxy.newProxyInstance(browser.getClass().getClassLoader(),browser.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        encrypt();
        Object retVal = method.invoke(browser, args);
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
