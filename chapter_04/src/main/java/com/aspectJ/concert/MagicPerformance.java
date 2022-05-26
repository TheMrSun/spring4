package com.aspectJ.concert;

/**
 * @author Slience
 * @version 1.0
 */
public class MagicPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("MagicPerformance 重写 perform()");
    }
}
