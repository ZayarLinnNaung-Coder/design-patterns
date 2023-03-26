package com.example.logistics;

import com.example.logistics.transport.Transport;

public abstract class Logistics {
    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();

    };

    abstract protected Transport createTransport();
}
