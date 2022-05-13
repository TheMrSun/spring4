package com.base.spChapter.chapter_03.externals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfigWithDefaults {

  @Autowired
  Environment env;
  
  @Bean
  public BlankCompatDisc blankCompatDisc() {
    return new BlankCompatDisc(
        env.getProperty("disc.title", "Rattle and Hum"),
        env.getProperty("disc.artist", "U2"));
  }
  
}
