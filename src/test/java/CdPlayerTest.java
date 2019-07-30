import components.CdPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {
    CdPlayer cdPlayer;

    @Before
    public void setUp() {
        cdPlayer = new CdPlayer();
    }

    @Test
    public void canPlayCd() {
        assertEquals("Clean CD Sound", cdPlayer.play());
    }
}
