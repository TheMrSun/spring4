package com.aspectJ.aspectJExtraFunction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectJExtraFunctionConfig {
    @Bean
    public Coder coder(){
        return new Coder();
    }
    @Bean
    public Human human(){
        return new Human();
    }
    @Bean
    public AspectConfig aspectConfig(){
        return new AspectConfig();
    }

}
