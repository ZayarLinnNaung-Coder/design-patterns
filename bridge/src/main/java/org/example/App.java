package org.example;

import org.example.device.Channel;
import org.example.device.Device;
import org.example.device.TV;
import org.example.remote.Remote;

public class App {
    public static void main( String[] args ) {
        Device tv = new TV();
        Remote remote = new Remote(tv);

        remote.togglePower();
        System.out.println("On: "+ tv.isEnabled());

        remote.switchChannel(Channel.CHANNEL7);
        System.out.println("Channel: "+ tv.getChannel());

        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeDown();
        remote.volumeDown();
        System.out.println("Volume: " + tv.getVolume());
    }
}
