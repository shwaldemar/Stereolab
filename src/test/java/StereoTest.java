import components.CdPlayer;
import components.Radio;
import components.RecordDeck;
import device.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;
    Radio radio;
    RecordDeck recordDeck;
    CdPlayer cdPlayer;

    @Before
    public void setUp() {
        radio = new Radio();
        recordDeck = new RecordDeck();
        cdPlayer = new CdPlayer();
        stereo = new Stereo("Robert's Big Beatbox", radio, recordDeck, cdPlayer);
    }

    @Test
    public void hasName() {
        assertEquals("Robert's Big Beatbox", stereo.getName());
    }

    @Test
    public void canTuneRadio() {
        assertEquals("Radio 1", stereo.tuneRadio());
    }
}
