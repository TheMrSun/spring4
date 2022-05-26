package javaConfig;

import com.javaConfig.CDPlayer2;
import com.javaConfig.CompatDisc2;
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
@ContextConfiguration(locations= "classpath:javaConfig/CDPlayJavaConfig.xml")
public class CDPlayerJavaConfigTest {

    @Autowired
    private CDPlayer2 cdPlayer2;
    @Autowired
    private CompatDisc2 cd2;

    @Test
    public void CDPlayerJavaConfigTestPlay(){
        cdPlayer2.play();
        cd2.play();
    }
}
