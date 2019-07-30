import components.CdPlayer;
import components.Radio;
import components.RecordDeck;
import device.Speaker;
import device.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeakersTest {
    Speaker speaker;
    Stereo stereo;
    Radio radio;
    RecordDeck recordDeck;
    CdPlayer cdPlayer;

    @Before
    public void setUp() {
        radio = new Radio();
        recordDeck = new RecordDeck();
        cdPlayer = new CdPlayer();
        stereo = new Stereo("Roberts Big Boom Box", radio, recordDeck, cdPlayer);
        speaker = new Speaker();
    }

    @Test
    public void canRaiseVolume() {
        speaker.connect(stereo);
        speaker.raiseVolume();
        assertEquals(6, speaker.getVolume());
    }

    @Test
    public void canLowerVolume() {
        speaker.connect(stereo);
        speaker.lowerVolume();
        assertEquals(4, speaker.getVolume());
    }
}
