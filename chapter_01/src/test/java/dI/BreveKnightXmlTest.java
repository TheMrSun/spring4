package dI;

import com.dI.Knight;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Slience
 * @version 1.0
 */

public class BreveKnightXmlTest {
    @Test
    public void braveKnightXmlTestQuest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MATE-INF/chapter_01/dI/Knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
