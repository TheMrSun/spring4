package com.aop;

import com.aop.BrowserAop.BrowserAfterReturningAdvice;
import com.aop.BrowserAop.BrowserAroundAdvice;
import com.aop.BrowserAop.BrowserBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;

/**
 * @author Slience
 * @version 1.0
 *
 * 使用硬编码方式实现spring aop
 */
public class BrowserProxyMain {
    public static void main(String[] args) {
        //创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //设置目标对象
        proxyFactory.setTarget(new ChromeBrowser());
//        //设置前置增强
//        proxyFactory.addAdvice(new BrowserBeforeAdvice());
//        //设置后置增强
//        proxyFactory.addAdvice(new BrowserAfterReturningAdvice());
          //设置环绕增强 = 前置增强 + 后置增强
//        proxyFactory.addAdvice(new BrowserAroundAdvice());
          //有选择性的增强,添加正则表达式切面类
        RegexpMethodPointcutAdvisor advisor = new RegexpMethodPointcutAdvisor();
        //添加环绕增强
        advisor.setAdvice(new BrowserAroundAdvice());
        //设置切入点表达式
        advisor.setPattern("com.base.spChapter.chapter_04.aop.ChromeBrowser.visitInternet");
        //添加切面
        proxyFactory.addAdvisor(advisor);
        //获取代理对象
        Browser browser = (Browser) proxyFactory.getProxy();
        browser.visitInternet();
        browser.listenMusic();

    }
}