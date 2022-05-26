package scopedbeans;

import com.scopedbeans.ComponentScannedConfig;
import com.scopedbeans.ExplicitConfig;
import com.scopedbeans.Notepad;
import com.scopedbeans.UniqueThing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * @author Slience
 * @version 1.0
 */
public class ScopedBeanTests {


    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes= ComponentScannedConfig.class)
    public static class ComponentScannedScopedBeanTest{
        @Autowired
        private ApplicationContext appContext;
        @Test
        public void testProxyScope(){
            Notepad notePad1 = appContext.getBean(Notepad.class);
            Notepad notePad2 = appContext.getBean(Notepad.class);
            assertNotSame(notePad1,notePad2);
        }
        @Test
        public void testSingletonScope(){
            UniqueThing thing1 = appContext.getBean(UniqueThing.class);
            UniqueThing thing2 = appContext.getBean(UniqueThing.class);
            assertSame(thing1,thing2);
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes= ExplicitConfig.class)
    public static class ExplicitConfigScopedBeanTest {

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope() {
            Notepad notepad1 = context.getBean(Notepad.class);
            Notepad notepad2 = context.getBean(Notepad.class);
            if(notepad1 == null){
                System.out.println("ok");
            }
            //此处ConfigurableBeanFactory.SCOPE_PROTOTYPE 失效
            assertSame(notepad1, notepad2);
        }

        @Test
        public void testSingletonScope() {
            UniqueThing thing1 = context.getBean(UniqueThing.class);
            UniqueThing thing2 = context.getBean(UniqueThing.class);
            assertSame(thing1, thing2);
        }

    }
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:scopedbeans/scoped-beans.xml")
    public static class XMLConfigScopedBeanTest {

        @Autowired
        private ApplicationContext context;

        @Test
        public void testProxyScope() {
            Notepad notepad1 = context.getBean(Notepad.class);
            Notepad notepad2 = context.getBean(Notepad.class);
            assertNotSame(notepad1, notepad2);
        }

        @Test
        public void testSingletonScope() {
            UniqueThing thing1 = context.getBean(UniqueThing.class);
            UniqueThing thing2 = context.getBean(UniqueThing.class);
            assertSame(thing1, thing2);
        }

    }


}
