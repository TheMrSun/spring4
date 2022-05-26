package com.aspectJ;

/**
 * @author Slience
 * @version 1.0
 */
public class CriticEngineImpl implements CriticEngine {
    private String[] criticismPool;

    public CriticEngineImpl() {
    }

    @Override
    public String getCriticism() {
        int i = (int)(Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
