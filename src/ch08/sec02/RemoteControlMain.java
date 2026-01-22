package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.turnOn();
        TvRemoteControl tr = (TvRemoteControl)rc;
        tr.turnOff();
        rc.volumeUp();
        rc.volumeUp();
        rc.volumeUp();
        rc.volumeUp();
        rc.volumeDown();
    }
}

