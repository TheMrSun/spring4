package aspectJ.aspectJ01;

import com.aspectJ.aspectJ01.concert.ConcertConfig;
import com.aspectJ.aspectJ01.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Slience
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertJavaConfig {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private Performance performance;
    //代理模式：实现相同接口，对于接口进行增强
//    @Autowired
//    private MagicPerform magicPerform;

    @Test
    public void ConcertJavaConfigTest() {
        Performance p = context.getBean(Performance.class);
        p.perform();
        performance.perform();
    }
}
