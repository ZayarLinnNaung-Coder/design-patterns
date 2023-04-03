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

    public double volumeUp(){
        device.increaseVolume();
        return device.getVolume();
    }

    public double volumeDown(){
        device.decreaseVolume();
        return device.getVolume();
    }

    public Channel switchChannel(Channel channel){
        device.setChannel(channel);
        return device.getChannel();
    }

}
