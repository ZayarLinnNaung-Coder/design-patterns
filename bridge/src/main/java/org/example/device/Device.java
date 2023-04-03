package org.example.device;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    double getVolume();
    void increaseVolume();
    void decreaseVolume();
    Channel getChannel();
    void setChannel(Channel channel);
}
