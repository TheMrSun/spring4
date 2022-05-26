package proxy;


import com.proxy.*;
import com.proxy.config.StaticChromeBrowserProxyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Slience
 * @version 1.0
 * ChromeBrowser 使用静态代理测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StaticChromeBrowserProxyConfig.class)
public class staticProxyTest {
    @Autowired
    private ChromeBrowser chromeBrowser;
    @Autowired
    private ChromeBrowserProxy chromeBrowserProxy;
    @Autowired
    private JdkBrowserProxy jdkBrowserProxy;
    @Autowired
    private CglibBrowserProxy cglibBrowserProxy;
    @Autowired
    private CglibIntroductionBrowserProxy cglibIntroductionBrowserProxy;
    @Test
    public void staticChromeBrowserProxyTest(){
        //静态代理
        chromeBrowserProxy.visitInternet();
        //jdk 动态代理
        Browser browser = jdkBrowserProxy.getProxy();
        browser.visitInternet();
        //cglib 动态代理
        ChromeBrowser cglibBrowser = cglibBrowserProxy.getProxy(ChromeBrowser.class);
        cglibBrowser.visitInternet();
        cglibBrowser.listenMusic();

        //cglib 引入增强,有接口实现方法，执行jdk反射执行，没有的调用自身实现的方法。
        ChromeBrowser cglibIntroductionBrowse = cglibIntroductionBrowserProxy.getProxy(ChromeBrowser.class);
        cglibIntroductionBrowse.visitInternet();

        Game game = (Game)cglibIntroductionBrowse;
        game.start();


    }
}
