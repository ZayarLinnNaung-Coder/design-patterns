package com.example.logistics;

import com.example.logistics.transport.Ship;
import com.example.logistics.transport.Transport;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
