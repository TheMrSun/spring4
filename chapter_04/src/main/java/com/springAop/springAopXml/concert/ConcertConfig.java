package com.springAop.springAopXml.concert;

import com.springAop.springAopXml.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@ComponentScan("com.springAop")
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    public MagicPerform magicPerform(){
        return new MagicPerform();
    }
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
