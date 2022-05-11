package com.base.spChapter.chapter_01.dI;

/**
 * @author Slience
 * @version 1.0
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
