package com.aspectJ;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Slience
 * @version 1.0
 * aspectJ 依赖jar包 aspectjrt aspectjweaver aspectj-maven-plugin
 * 加入aspectj-maven-plugin依然报错,执行maven clean install
 */

public aspect CriticAspect {
    public CriticEngine criticEngine;

    public CriticAspect() {
    }

    pointcut performance(): execution(* com.aspectJ.concert.Performance.perform(..));

    after(): performance(){
        System.out.println(criticEngine.getCriticism());
    }

    public void setCriticEngine(CriticEngine criticEngine) {
        this.criticEngine = criticEngine;
    }

}
