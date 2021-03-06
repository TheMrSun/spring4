package dI;


import com.dI.Knight;
import com.dI.config.KnightConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author Slience
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= KnightConfig.class,loader= AnnotationConfigContextLoader.class)
public class BraveKnightJavaConfigTest {

    @Autowired
    Knight knight;

    @Test
    public void BraveKnightJavaConfigTestQuest(){
        knight.embarkOnQuest();
    }
}
