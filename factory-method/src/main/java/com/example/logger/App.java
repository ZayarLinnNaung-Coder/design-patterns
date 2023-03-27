package com.example.logger;

public class App {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new ConsoleLoggerFactory();
        loggerFactory.getLogger().info("HELLO");

        LoggerFactory loggerFactory2 = new FileLoggerFactory();
        loggerFactory2.getLogger().info("HELLO");
    }
    
}
