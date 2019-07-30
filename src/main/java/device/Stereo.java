package device;

import components.*;

public class Stereo {
    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdPlayer cdPlayer;
    private int volume;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CdPlayer cdPlayer) {
        this.name = name;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
        this.volume = 5;
    }

    public String getName() {
        return this.name;
    }

    public String tuneRadio() {
        return radio.tune("Radio 1");
    }


    public String playRecord() {
        return recordDeck.play();
    }

    public String playCd() {
        return cdPlayer.play();
    }

    public int getVolume() {
        return volume;
    }

    public void raiseVolume() {
        this.volume += 1;
    }

    public void lowerVolume() {
        this.volume -= 1;
    }
}
