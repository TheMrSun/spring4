package com.base.spChapter.chapter_02.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
public class CDPlayConfig2 {
    @Bean
    public CompatDisc2 compatDisc2(){
        return new SgtPepper2();
    }
    @Bean
    public CDPlayer2 cdPlayer2(CompatDisc2 compatDisc2){
        return new CDPlayer2(compatDisc2);
    }

}
