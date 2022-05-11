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
@ContextConfiguration(locations= "classpath:MATE-INF/chapter_02/xmlConfig/ConstructorArgCollectionTest-context.xml")
public class ConstructorArgCollectionTest {
    @Autowired
    private CompatDisc3 cd;
    @Test
    public void test(){
        cd.play();
        BlanKDiscList bcd = (BlanKDiscList)cd;
        System.out.println(bcd.getTitle());
        System.out.println(bcd.getTitle());
        System.out.println(bcd.getTraces());
    }
}
