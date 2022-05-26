package com.mixConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@Import(CDPlaye4Config.class)
@ImportResource("classpath:mixConfig/cd-config.xml")
public class mixConfig2 {
}
