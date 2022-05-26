package xmlConfig;

import com.xmlConfig.CDPlayer3;
import com.xmlConfig.CompatDisc3;
import com.xmlConfig.MediaPlayer3;
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
@ContextConfiguration(locations= "classpath:xmlConfig/ConstructorArgReferenceTest-context.xml")
public class ConstructorArgReferenceTest {

    @Autowired
    private CompatDisc3 cd;
    @Autowired
    private MediaPlayer3 mediaPlayer3;
    @Autowired
    private CDPlayer3 cdPlayer3;

    @Test
    public void CDPlayerTestPlay(){
        cd.play();
        mediaPlayer3.play();
        cdPlayer3.play();
    }
}
