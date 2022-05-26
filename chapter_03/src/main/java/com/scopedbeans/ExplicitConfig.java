package com.scopedbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
public class ExplicitConfig {
    @Bean
    public Notepad notepad(){
        return new Notepad();
    }
    @Bean
    public UniqueThing uniqueThing(){
        return new UniqueThing();
    }
}
