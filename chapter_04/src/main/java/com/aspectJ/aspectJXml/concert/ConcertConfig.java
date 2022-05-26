package com.aspectJ.aspectJXml.concert;

import com.aspectJ.aspectJXml.Audience;
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
}
