package com.mixConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@Import({CDPlaye4Config.class, CDConfig4.class})
public class mixConfig {
}
