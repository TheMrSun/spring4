package com.springAop.springAop02;

import java.util.List;

/**
 * @author Slience
 * @version 1.0
 */
public class BlankDisc implements CompatDisc{
    private String title;
    private String artist;
    private List<String> tracks;

//    public BlankDisc(String title, String artist, List<String> tracks) {
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }
    @Override
    public void play() {
        System.out.println("title:" + title);
        System.out.println("artist:" + artist);
        System.out.println("tracks:" + tracks);
        System.out.println("BlankDisc 实现 CompatDisc 重写 play()");
    }
    @Override
    public void playTrack(int trackNumber) {
        System.out.println("BlankDisc 实现 CompatDisc 重写 playTrack()");
        System.out.println("playTrack trackNumber=" + trackNumber);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
