package com.example.logistics.transport;

public class Train implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by train...");
    }
}
