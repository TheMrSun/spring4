package com.mixConfig;

import java.util.List;

/**
 * @author Slience
 * @version 1.0
 */
public class BlankDisc4 implements CompatDisc4 {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc4(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("title:" + title);
        System.out.println("artist:" + artist);
        System.out.println("tracks:" + tracks);
        System.out.println("BlankDisc4 实现 CompatDisc4 重写 play()");
    }
}
