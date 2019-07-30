package device;

import interfaces.IConnect;

public class Mp3Player implements IConnect {

    public String connect(Stereo stereo) {
        return stereo.getName();
    }


}
