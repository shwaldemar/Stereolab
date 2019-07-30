import components.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    RecordDeck recordDeck;

    @Before
    public void setUp() {
        recordDeck = new RecordDeck();
    }

    @Test
    public void canPlayRecords() {
        assertEquals("Smooth Record Tone", recordDeck.play());
    }
}
