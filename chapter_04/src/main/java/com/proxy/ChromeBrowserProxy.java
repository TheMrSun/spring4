package com.proxy;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Slience
 * @version 1.0
 * 静态代理
 */
public class ChromeBrowserProxy implements Browser {

    private Browser browser;
    @Autowired
    public ChromeBrowserProxy(Browser browser) {
        this.browser = browser;
    }

    @Override
    public void visitInternet() {
        encrypt();
        browser.visitInternet();
        decrypt();
    }

    private void encrypt(){
        System.out.println("encrypt 加密");
    }
    private void decrypt(){
        System.out.println("decrypt 解密");
    }
}
