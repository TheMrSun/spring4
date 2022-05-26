package com.proxy.config;


import com.proxy.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
public class StaticChromeBrowserProxyConfig {

    @Bean
    public ChromeBrowser chromeBrowser(){
        return new ChromeBrowser();
    }
    @Bean
    public ChromeBrowserProxy chromeBrowserProxy(ChromeBrowser chromeBrowser){
        return new ChromeBrowserProxy(chromeBrowser);
    }

    @Bean
    public JdkBrowserProxy jdkBrowserProxy(ChromeBrowser chromeBrowser){
        return new JdkBrowserProxy(chromeBrowser);
    }
    @Bean
    public CglibBrowserProxy cglibBrowserProxy(){
        return new CglibBrowserProxy();
    }
    @Bean
    public CglibIntroductionBrowserProxy cglibIntroductionBrowserProxy(){
        return new CglibIntroductionBrowserProxy();
    }
}
