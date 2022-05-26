package aspectJ.aspectJ02;

import com.aspectJ.aspectJ01.concert.ConcertConfig;
import com.aspectJ.aspectJ02.CompatDisc;
import com.aspectJ.aspectJ02.TrackCounter;
import com.aspectJ.aspectJ02.TrackCounterConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Slience
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterConfigTest {
    @Autowired
    private CompatDisc cd;
    @Autowired
    private TrackCounter counts;
    @Test
    public void trackCounterTest(){
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(1);
        System.out.println("................................");
        System.out.println(counts.getPlayCount(1));
        System.out.println(counts.getPlayCount(2));
    }

}
