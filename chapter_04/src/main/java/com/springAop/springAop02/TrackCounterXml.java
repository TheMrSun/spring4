package com.springAop.springAop02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Slience
 * @version 1.0
 */
public class TrackCounterXml {

    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();


    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
        System.out.println("已做记录");
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}
