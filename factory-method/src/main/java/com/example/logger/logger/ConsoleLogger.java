package com.example.logger.logger;

public class ConsoleLogger implements Logger{
    @Override
    public void info(String text) {
        System.out.println("[INFO] " + text);
    }

    @Override
    public void warm(String text) {
        System.out.println("[WARM] " + text);
    }

    @Override
    public void err(String text) {
        System.out.println("[ERROR] " + text);
    }
}
