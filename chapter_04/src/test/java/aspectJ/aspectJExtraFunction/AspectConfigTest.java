package aspectJ.aspectJExtraFunction;

import com.aspectJ.aspectJExtraFunction.Animal;
import com.aspectJ.aspectJExtraFunction.AspectJExtraFunctionConfig;
import com.aspectJ.aspectJExtraFunction.Person;
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
@ContextConfiguration(classes = AspectJExtraFunctionConfig.class)
public class AspectConfigTest {
    @Autowired
    private Person person;
    @Test
    public void aspectJExtraFunctionTest(){
        person.code();
        Animal animal = (Animal)person;
        animal.sleep();
    }
}
