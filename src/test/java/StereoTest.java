import device.Stereo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;

    @Before
    public void setUp() {
        stereo = new Stereo("Robert's Big Beatbox");
    }

    @Test
    public void hasName() {
        assertEquals("Robert's Big Beatbox", stereo.getName());
    }
}
