package com.base.spChapter.chapter_01.dI.config;

import com.base.spChapter.chapter_01.dI.BraveKnight;
import com.base.spChapter.chapter_01.dI.Knight;
import com.base.spChapter.chapter_01.dI.Quest;
import com.base.spChapter.chapter_01.dI.RescueDamselQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest(){
        return new RescueDamselQuest();
    }

}
