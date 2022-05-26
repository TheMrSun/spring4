package com.springAop.springAop01.concert;

import com.springAop.springAop01.Audience;
import com.springAop.springAop01.Audience2;
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
    @Bean
    public Audience2 audience2(){
        return new Audience2();
    }
}
