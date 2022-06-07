package com.tsl.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Slience
 * @version 1.0
 *
 * AbstractAnnotationConfigDispatcherServletInitializer
 * 创建DispatcherServlet和ContextLoaderListener
 * DispatcherServlet 创建spring 上下文，并加载配置文件，getServletConfigClasses 中的配置类WebConfig
 * ContextLoaderListener servlet 监听器
 * getServletMappings 将路径映射至 dispatcherServlet
 * getServletConfigClasses 返回带有@Configuration 注解类来定义dispatcherServlet 应用上下文Bean
 * getRootConfigClasses 返回带有@Configuration 注解来定义配置ContextLoaderListener 应用上下文
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
