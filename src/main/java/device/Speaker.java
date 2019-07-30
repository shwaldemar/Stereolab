package device;

import interfaces.IConnect;

public class Speaker implements IConnect {
    Stereo stereo;

    public String connect(Stereo stereo) {
        this.stereo = stereo;
        return stereo.getName();
    }

    public int getVolume() {
        return stereo.getVolume();
    }

    public void raiseVolume() {
        stereo.raiseVolume();
    }

    public void lowerVolume() {
        stereo.lowerVolume();
    }
}
