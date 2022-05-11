package com.base.spChapter.chapter_02.mixConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
public class CDConfig4 {
    @Bean
    public CompatDisc4 compatDisc4(){
        return new SgtPepper4();
    }

}
