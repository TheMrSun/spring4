package dI;

import com.dI.BraveKnight;
import com.dI.Quest;
import com.dI.RescueDamselQuest;
import com.dI.SlayDragonQuest;
import org.junit.Test;

/**
 * @author Slience
 * @version 1.0
 */

public class BraveKnightTest {

    @Test
    public void braveKnightTestQuest(){
        //Quest mockQuest = mock(Quest.class);
        Quest quest1 = new RescueDamselQuest();
        Quest quest2 = new SlayDragonQuest();
        BraveKnight knight1 = new BraveKnight(quest1);
        knight1.embarkOnQuest();

        BraveKnight knight2 = new BraveKnight(quest2);
        knight2.embarkOnQuest();
    }

}
