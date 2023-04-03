package org.example.device;

public enum Channel {

    MRTV(1),
    MWD(2),
    MRTV4(3),
    CHANNEL7(4),
    CN(5);

    private final int channelNumber;

    Channel(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    int getChannelNumber(){
        return channelNumber;
    }
}
