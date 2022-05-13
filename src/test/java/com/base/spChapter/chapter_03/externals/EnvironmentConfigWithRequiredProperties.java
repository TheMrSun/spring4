package com.base.spChapter.chapter_03.externals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfigWithRequiredProperties {

  @Autowired
  Environment env;
  
  @Bean
  public BlankCompatDisc blankCompatDisc() {
    return new BlankCompatDisc(
        env.getRequiredProperty("disc.title"),
        env.getRequiredProperty("disc.artist"));
  }
  
}
