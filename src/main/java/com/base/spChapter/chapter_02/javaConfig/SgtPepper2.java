package com.base.spChapter.chapter_02.javaConfig;

/**
 * @author Slience
 * @version 1.0
 */
public class SgtPepper2 implements CompatDisc2 {
    @Override
    public void play() {
        System.out.println("SgtPepper2 实现接口 CompatDisc 重写play()");
    }
}
