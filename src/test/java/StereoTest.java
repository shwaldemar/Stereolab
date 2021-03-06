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

    @Test
    public void canPlayRecord() {
        assertEquals("Smooth Record Tone", stereo.playRecord());
    }

    @Test
    public void canPlayCd() {
        assertEquals("Clean CD Sound", stereo.playCd());
    }

    @Test
    public void canRaiseVolume() {
        stereo.raiseVolume();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void canLowerVolume() {
        stereo.lowerVolume();
        assertEquals(4, stereo.getVolume());
    }
}
