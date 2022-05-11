package com.base.spChapter.chapter_02.autoConfig;

import com.base.spChapter.chapter_02.autoConfig.CDPlayerConfig;
import com.base.spChapter.chapter_02.autoConfig.CompatDisc;
import com.base.spChapter.chapter_02.autoConfig.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Slience
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private MediaPlayer mediaPlayer;
    @Autowired
    private CompatDisc cd;

    @Test
    public void CDPlayerTestPlay(){
        mediaPlayer.play();
        cd.play();
    }
}
