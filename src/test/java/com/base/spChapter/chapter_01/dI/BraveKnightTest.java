package com.base.spChapter.chapter_01.dI;

import org.junit.Test;

import static org.mockito.Mockito.mock;

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
