package com.springAop.springAopXml.concert;

/**
 * @author Slience
 * @version 1.0
 */
public class MagicPerform implements Performance {
    @Override
    public void perform() {
        System.out.println("MagicPerform 重写 perform()");
    }
}
