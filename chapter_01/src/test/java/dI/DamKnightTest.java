package dI;

import com.dI.DamKnight;
import com.dI.RescueDamselQuest;
import org.junit.Test;

/**
 * @author Slience
 * @version 1.0
 */
public class DamKnightTest {
    @Test
    public void DamKnightTestQuest(){
        //只能执行单一任务，同类型的任务无法执行
        RescueDamselQuest quest1 = new RescueDamselQuest();
        //Quest quest2 = new SlayDragonQuest();
        DamKnight damKnight = new DamKnight(quest1);
        damKnight.embarkOnQuest();
    }
}
