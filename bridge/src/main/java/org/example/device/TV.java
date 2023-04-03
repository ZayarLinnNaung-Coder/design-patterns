package org.example.device;

public class TV implements Device{

    private boolean enable;
    private double volume;
    private Channel channel;

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void increaseVolume() {
        if(volume <= 100){
            volume += 10;
        }
    }

    @Override
    public void decreaseVolume() {
        if(volume > 0){
            volume -= 10;
        }
    }

    @Override
    public Channel getChannel() {
        return channel;
    }

    @Override
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
