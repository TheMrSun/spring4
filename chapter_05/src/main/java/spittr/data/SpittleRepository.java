package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * @author Slience
 * @version 1.0
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long maxId,int count);
}
