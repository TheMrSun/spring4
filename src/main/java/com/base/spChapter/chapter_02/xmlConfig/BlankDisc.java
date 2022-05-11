package com.base.spChapter.chapter_02.xmlConfig;

/**
 * @author Slience
 * @version 1.0
 */
public class BlankDisc implements CompatDisc3 {
    private String title;

    public BlankDisc(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("BlankDisc 实现 CompatDisc3 重写play" + "其中title属性为" +title);
    }
}
