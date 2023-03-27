package com.example.logger;

import com.example.logger.logger.Logger;
import com.example.logger.logger.TextLogger;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    Logger getLogger() {
        return new TextLogger();
    }
}
