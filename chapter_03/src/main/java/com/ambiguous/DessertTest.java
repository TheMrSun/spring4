package com.ambiguous;

import com.ambiguous.config.Cold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Slience
 * @version 1.0
 */
@Component
public class DessertTest  {
    private Dessert dessert;
    @Autowired
    //@Qualifier("cool")
    @Cold
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }


    public void taste(){
        dessert.taste();
    }
}
