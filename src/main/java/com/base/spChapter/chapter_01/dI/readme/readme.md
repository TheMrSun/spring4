1.接口编程  BraveKnightTest DamKnightTest 
2.DI作用：
  传统做法：DamKnight 对象负责管理与自己相互协作的对象（即它所依赖的对象）的引用，这将会导致高度耦合和难以测试的代码。
  DI解耦:利用接口编程思想、配置的方式管理对象之间的协作引用。
  xml配置 BreveKnightXmlTest
  javaConfig配置 BraveKnightJavaConfigTest
3.AOP作用：
  传统：业务对象与系统级服务(日志、安全、事务)结合得过于紧密,自身核心业务无关的代码而变得混乱.
  AOP服务模块化,这些组件会具有更高的内聚性,关注自身的业务，完全不需要了解涉及系统服务所带来复杂性。AOP能够确保POJO的简单性
  AOP配置：Minstrel.xml braveKnightMinstrelAopTest
