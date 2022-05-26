package com.javaConfig;

import com.autoConfig.CompatDisc;
import com.autoConfig.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Slience
 * @version 1.0
 */
public class CDPlayer2 implements MediaPlayer {
    private CompatDisc2 cd;

    public CDPlayer2(CompatDisc2 cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
