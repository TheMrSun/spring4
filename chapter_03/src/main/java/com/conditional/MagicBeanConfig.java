package com.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
public class MagicBeanConfig {

    @Bean
    public Magic magic() {
        return new Magic();
    }
    @Bean
    @Conditional(MagicExistCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

}
