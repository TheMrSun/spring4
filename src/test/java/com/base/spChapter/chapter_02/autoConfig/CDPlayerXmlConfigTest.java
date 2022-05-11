package com.base.spChapter.chapter_02.autoConfig;

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
@ContextConfiguration(locations="classpath:MATE-INF/chapter_02/autoConfig/CDPlayerConfigXml.xml")
public class CDPlayerXmlConfigTest {

    @Autowired
    private MediaPlayer mediaPlayer;
    @Autowired
    private CompatDisc cd;
    @Test
    public void CDPlayerXmlConfigTestPLay(){
        mediaPlayer.play();
        cd.play();
    }



}
