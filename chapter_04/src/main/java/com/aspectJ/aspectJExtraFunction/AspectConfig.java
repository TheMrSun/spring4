package com.aspectJ.aspectJExtraFunction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author Slience
 * @version 1.0
 */

@Aspect
public class AspectConfig {
    /**
     * value:属性指定了哪种类型的bean要引入该接口。在本例中，也就
     *       是所有实现Person的类型。（标记符后面的加号表示
     *       是Person的所有子类型，而不是Person本身。
     * defaultImpl属性指定了为引入功能提供实现的类。在这里，我们
     *            指定的是Human提供实现。
     * DeclareParents注解所标注指明了要引入了接口
     */
    @DeclareParents(value="com.aspectJ.aspectJExtraFunction.Person+",
            defaultImpl = Human.class)
    public Animal animal;
}
