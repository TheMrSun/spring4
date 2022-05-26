package com.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Slience
 * @version 1.0
 */
public class MagicExistCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        System.out.println(environment.getActiveProfiles());

        System.out.println(environment.containsProperty("magic"));
        return environment.containsProperty("magic");

    }
}
