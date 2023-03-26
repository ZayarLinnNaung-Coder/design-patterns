package com.example.logistics;

import com.example.logistics.transport.Car;
import com.example.logistics.transport.Train;
import com.example.logistics.transport.Transport;

public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
//        return new Car();
        return new Train();
    }
}
