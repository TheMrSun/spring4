package com.ambiguous;

import com.ambiguous.config.Cold;
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
