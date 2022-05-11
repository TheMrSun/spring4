package com.base.spChapter.chapter_02.xmlConfig;

import java.util.List;

/**
 * @author Slience
 * @version 1.0
 * construct 实现
 */
public class BlanKDiscList implements CompatDisc3 {

    private String title;

    private String artist;

    private List<String> traces;

    public BlanKDiscList(String title, String artist, List<String> traces) {
        this.title = title;
        this.artist = artist;
        this.traces = traces;
    }

    @Override
    public void play() {
        System.out.println("BlanKDiscList 实现了 CompatDisc3 重写play()");
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
