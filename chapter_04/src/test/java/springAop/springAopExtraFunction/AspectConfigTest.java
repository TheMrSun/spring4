package springAop.springAopExtraFunction;

import com.springAop.springAopExtraFunction.Animal;
import com.springAop.springAopExtraFunction.AspectJExtraFunctionConfig;
import com.springAop.springAopExtraFunction.Person;
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
