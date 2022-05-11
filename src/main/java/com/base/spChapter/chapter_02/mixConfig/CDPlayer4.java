package com.base.spChapter.chapter_02.mixConfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Slience
 * @version 1.0
 */
public class CDPlayer4 implements MediaPlayer4{

    private CompatDisc4 cd;

    @Autowired
    public CDPlayer4(CompatDisc4 cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
