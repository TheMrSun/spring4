1.AOP 面向切面编程，解耦
    术语：通知(Advice) :定义切面：何时、做什么
            前置通知(before)
            后置通知(After)
            返回通知(After-returning)
            异常通知(After-throwing)
            环绕通知(Around)
         切点(pointcut):定义切面: 何处
         连接点(join point):通知的时机，程序执行过程中,调用方法、抛出异常、修改字段等
         切面(Aspect) :通知 + 切点
         引入(Introduction): 为现有类添加方法、或者属性，无须更改现有类
         织入(weaving): 将切面应用到目标对象并创建新代理对象的过程
            编译期织入
            类加载织入
            运行期织入
2.spring 实现 AOP 方式:
    基于代理的经典Spring AOP
    纯POJO切面
    @AspectJ 注解驱动的切面
    注入式aspectJ切面
3.代理模式 proxy https://my.oschina.net/u/2377110/blog/1504596
    