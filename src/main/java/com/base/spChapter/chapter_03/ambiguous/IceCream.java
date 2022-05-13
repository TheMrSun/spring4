package com.base.spChapter.chapter_03.ambiguous;

import com.base.spChapter.chapter_03.ambiguous.config.Cold;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Slience
 * @version 1.0
 */
@Component
//@Qualifier("cool")
@Cold
public class IceCream implements Dessert {
    @Override
    public void taste() {
        System.out.println("IceCream 实现 Dessert 接口 重写 taste()");
    }
}
