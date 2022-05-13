package com.base.spChapter.chapter_03.ambiguous;

import com.base.spChapter.chapter_02.autoConfig.CDPlayerConfig;
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
@ContextConfiguration(classes=DessertConfig.class)
public class DessertTasteTestCase {

    @Autowired
    private DessertTest dessertTest;
    @Test
    public void test(){
        dessertTest.taste();

    }
}
