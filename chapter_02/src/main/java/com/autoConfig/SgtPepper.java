package com.autoConfig;

import org.springframework.stereotype.Component;

/**
 * @author Slience
 * @version 1.0
 */
@Component
public class SgtPepper implements CompatDisc {
    @Override
    public void play() {
        System.out.println("SgtPepper 实现 CompatDisc接口 执行play()");
    }
}
