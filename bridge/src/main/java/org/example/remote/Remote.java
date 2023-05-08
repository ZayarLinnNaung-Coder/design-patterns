package org.example.remote;

import org.example.device.Channel;
import org.example.device.Device;

public class Remote {

    private Device device;

    public Remote(Device device){
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
        }else{
            device.enable();
        }
    }

    public void volumeUp(){
        device.increaseVolume();
    }

    public void volumeDown(){
        device.decreaseVolume();
    }

    public void switchChannel(Channel channel){
        device.setChannel(channel);
    }

}
