package com.base.spChapter.chapter_03.externals;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class EnvironmentInjectionTest {

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=EnvironmentConfig.class)
  public static class InjectFromProperties {
  
    @Autowired
    private BlankCompatDisc blankCompatDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("The Beatles", blankCompatDisc.getArtist());
      assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankCompatDisc.getTitle());
    }
    
  }
  
  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=EnvironmentConfigWithDefaults.class)
  public static class InjectFromPropertiesWithDefaultValues {
  
    @Autowired
    private BlankCompatDisc blankCompatDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("U2", blankCompatDisc.getArtist());
      assertEquals("Rattle and Hum", blankCompatDisc.getTitle());
    }
    
  }

  public static class InjectFromPropertiesWithRequiredProperties {
  
    @Test(expected=BeanCreationException.class)
    public void assertBlankDiscProperties() {
      new AnnotationConfigApplicationContext(EnvironmentConfigWithRequiredProperties.class);
    }
    
  }

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration("classpath:MATE-INF/chapter_03/externals/placeholder-config.xml")
  public static class InjectFromProperties_XMLConfig {
  
    @Autowired
    private BlankCompatDisc blankCompatDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      // http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd"
      // 没有引入DTD解析文件，导致xml外部传值失败
      assertEquals("The Beatles", blankCompatDisc.getArtist());
      assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankCompatDisc.getTitle());
    }
    
  }

}