package com.scopedbeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author Slience
 * @version 1.0
 */
@Configuration
@ComponentScan(excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION, value=Configuration.class)})
public class ComponentScannedConfig {
}
