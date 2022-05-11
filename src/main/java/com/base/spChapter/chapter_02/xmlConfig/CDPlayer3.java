package com.base.spChapter.chapter_02.xmlConfig;

/**
 * @author Slience
 * @version 1.0
 */
public class CDPlayer3 implements MediaPlayer3 {
    private CompatDisc3 cd;

    public CDPlayer3(CompatDisc3 cd) {
        this.cd = cd;
    }
    @Override
    public void play() {
        cd.play();
    }


}
