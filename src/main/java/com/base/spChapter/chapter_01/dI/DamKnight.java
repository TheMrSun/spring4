package com.base.spChapter.chapter_01.dI;

/**
 * @author Slience
 * @version 1.0
 */
public class DamKnight implements Knight {

    private RescueDamselQuest quest;

    public DamKnight(RescueDamselQuest quest){
        this.quest = quest;
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
