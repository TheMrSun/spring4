package mixConfig;

import com.mixConfig.CompatDisc4;
import com.mixConfig.MediaPlayer4;
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
@ContextConfiguration(locations= "classpath:mixConfig/mixConfig.xml")
public class CDPlayer4Configs {

    @Autowired
    private CompatDisc4 cd;

    @Autowired
    private MediaPlayer4 mediaPlayer4;
    @Test
    public void test(){
        cd.play();
        mediaPlayer4.play();
    }


}
