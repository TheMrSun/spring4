package com.base.spChapter.chapter_03.ambiguous;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@ComponentScan
public class DessertConfig {
    @Bean
    public Cake cake(){
        return new Cake();
    }
    @Bean
    public IceCream iceCream(){
        return new IceCream();
    }
    @Bean
    public Popsicle popsicle(){
        return new Popsicle();
    }
}
