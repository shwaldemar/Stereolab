package components;

public class Radio {
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

}
