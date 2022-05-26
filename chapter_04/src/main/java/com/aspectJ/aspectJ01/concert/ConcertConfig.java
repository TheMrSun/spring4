package com.aspectJ.aspectJ01.concert;

import com.aspectJ.aspectJ01.Audience;
import com.aspectJ.aspectJ01.Audience2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@ComponentScan("com.aspectJ")
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
