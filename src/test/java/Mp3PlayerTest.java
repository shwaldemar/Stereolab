import components.*;
import device.Mp3Player;
import device.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {
    Mp3Player mp3Player;
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
        mp3Player = new Mp3Player();
    }

    @Test
    public void canGetStereoName() {
        assertEquals("Roberts Big Boom Box", mp3Player.connect(stereo));
    }


}
