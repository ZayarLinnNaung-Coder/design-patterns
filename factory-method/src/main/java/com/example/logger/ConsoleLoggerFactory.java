package com.example.logger;

import com.example.logger.logger.ConsoleLogger;
import com.example.logger.logger.Logger;

public class ConsoleLoggerFactory extends LoggerFactory{
    @Override
    Logger getLogger() {
        return new ConsoleLogger();
    }
}
