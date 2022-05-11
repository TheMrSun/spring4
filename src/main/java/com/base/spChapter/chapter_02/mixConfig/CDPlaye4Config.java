package com.base.spChapter.chapter_02.mixConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
public class CDPlaye4Config {
    @Bean
    public CDPlayer4 cdPlayer4(CompatDisc4 compatDisc4){
        return new CDPlayer4(compatDisc4);
    }
}
