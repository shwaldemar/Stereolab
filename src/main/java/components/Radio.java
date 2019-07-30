package components;

import musicPlayer.Component;

public class Radio extends Component {
    private String station;
    public Radio() {
        this.station = "Radio 4";
    }

    public String getStation() {
        return station;
    }

    public String tune(String station) {
        return this.station = station;
    }

    public String play() {
        return "Something from a radio station DJ";
    }

}
