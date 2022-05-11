package com.base.spChapter.chapter_02.xmlConfig;

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
@ContextConfiguration(locations= "classpath:MATE-INF/chapter_02/xmlConfig/CNamespaceValueTest-context.xml")
public class CNamespaceValueTestTest {
    @Autowired
    private CompatDisc3 cd;

    @Autowired
    private MediaPlayer3 mediaPlayer3;

    @Test
    public void CDPlayerTestPlay(){
        cd.play();
        mediaPlayer3.play();
    }

}
