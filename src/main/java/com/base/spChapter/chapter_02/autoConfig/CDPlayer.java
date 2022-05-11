package com.base.spChapter.chapter_02.autoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Slience
 * @version 1.0
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompatDisc cd;

    @Autowired
    public CDPlayer(CompatDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
