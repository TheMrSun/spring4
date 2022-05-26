package xmlConfig;

import com.xmlConfig.BlankDiscList2;
import com.xmlConfig.CompatDisc3;
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
@ContextConfiguration(locations= "classpath:xmlConfig/PNamespaceValueTest-context.xml")
public class PNamespaceValueTest {
    @Autowired
    private CompatDisc3 cd;
    @Test
    public void test(){
        cd.play();
        BlankDiscList2 bcd = (BlankDiscList2)cd;
        System.out.println(bcd.getTitle());
        System.out.println(bcd.getArtist());
        System.out.println(bcd.getTraces());

    }

}
