1.spring 配置方式:xml显示配置、java显示配置、隐式bean发现机制和自动装配
         优先 自动装配、java显示配置、xml显示配置
  spring自动装配：实现依靠组件扫描、自动装配
  
  xml 配置：传值 <constructor-arg> 为构造器传值 c-命名空间
           传值 <property> 为set 传值          p-命名空间
           何时使用：当传入属性与类有强依赖时使用 构造器传值
                    当传入属性与类是弱依赖，即为可有可无参数时，选择set 传值


