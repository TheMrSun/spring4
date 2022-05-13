package com.base.spChapter.chapter_03.conditional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author Slience
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:MATE-INF/chapter_03/conditional/magicConfig.xml")
public class MagicExistTest {

    @Autowired
    private Magic magic;
//    @Autowired
//    private MagicBean magicBean;
    @Test
    public void test(){
        magic.play();
        //TODO : magic从在实现MagicBean创建
        //magicBean.play();
    }
}
