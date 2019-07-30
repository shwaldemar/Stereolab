import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp() {
        radio = new Radio();
    }

    @Test
    public void canTune() {

        assertEquals("Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void canPlay() {
        assertEquals("Something from a radio station DJ", radio.play());
    }
}
