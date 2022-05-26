package com.aop;

/**
 * @author Slience
 * @version 1.0
 */
public class ChromeBrowser implements Browser{

    @Override
    public void visitInternet() {
        System.out.println("use ChromeBrowser visitInternet");
    }

    @Override
    public void listenMusic() {
        System.out.println("use ChromeBrowser listenMusic");
    }
}
