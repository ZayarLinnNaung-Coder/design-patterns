package com.example.logistics.transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by ship...");
    }
}
