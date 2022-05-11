package com.base.spChapter.chapter_02.mixConfig;

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
@ContextConfiguration(classes=mixConfig2.class)
public class ImportXmlConfig {
    @Autowired
    private MediaPlayer4 mediaPlayer4;

    @Autowired
    private CompatDisc4 cd;

    @Test
    public void test(){
       cd.play();
       mediaPlayer4.play();
    }

}
