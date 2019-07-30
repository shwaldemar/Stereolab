package device;

import components.*;

public class Stereo {
    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdPlayer cdPlayer;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CdPlayer cdPlayer) {
        this.name = name;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
    }

    public String getName() {
        return this.name;
    }

    public String tuneRadio() {
        return radio.tune("Radio 1");
    }


}
