package com.base.spChapter.chapter_03.ambiguous;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Slience
 * @version 1.0
 */
@Component
// @Primary 优先加载该bean
public class Cake implements Dessert {
    @Override
    public void taste() {
        System.out.println("Cake 实现 Dessert 接口 重写taste()");
    }
}
