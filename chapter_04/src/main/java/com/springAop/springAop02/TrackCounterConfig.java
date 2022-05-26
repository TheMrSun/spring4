package com.springAop.springAop02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompatDisc SgtPepper(){
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("haha");
        blankDisc.setArtist("tom");
        List<String> tracks = new ArrayList<String>();
        tracks.add("song1");
        tracks.add("song2");
        tracks.add("song3");
        tracks.add("song4");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
