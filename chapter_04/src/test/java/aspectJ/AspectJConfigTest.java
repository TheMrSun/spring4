package aspectJ;

import com.aspectJ.CriticEngine;
import com.aspectJ.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Slience
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:aspectJ/aspectJConfig.xml")
public class AspectJConfigTest {
    @Autowired
    private Performance p;
    @Autowired
    private CriticEngine criticEngine;

    @Test
    public void aspectTest(){
        p.perform();

    }
}
