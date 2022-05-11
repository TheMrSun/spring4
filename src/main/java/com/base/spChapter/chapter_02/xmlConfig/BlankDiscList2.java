package com.base.spChapter.chapter_02.xmlConfig;

import java.util.List;

/**
 * @author Slience
 * @version 1.0
 */
public class BlankDiscList2 implements CompatDisc3 {
    private String title;
    private String artist;
    private List<String> traces;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTraces(List<String> traces) {
        this.traces = traces;
    }

    @Override
    public void play() {
        System.out.println("BlankDiscList2 实现 CompatDisc3 接口 重写 play()");
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public List<String> getTraces() {
        return traces;
    }
}
