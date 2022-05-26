package dI;

import com.dI.Knight;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Slience
 * @version 1.0
 */
public class BraveKnightMinstrelAop {
    @Test
    public void braveKnightMinstrelAopTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MATE-INF/chapter_01/dI/Minstrel.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
