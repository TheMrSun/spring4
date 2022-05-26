package com.aspectJ.aspectJ01;

import com.aspectJ.aspectJ01.concert.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Slience
 * @version 1.0
 */
//@Configuration
//@ComponentScan
//@EnableAspectJAutoProxy
public class aspectJMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(aspectJMain.class);
        Performance p = context.getBean(Performance.class);
        p.perform();
    }
}
