package com.example.logger.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextLogger implements Logger{
    @Override
    public void info(String text) {
        writeFile("[INFO] " + text);
    }

    @Override
    public void warm(String text) {
        writeFile("[WARM] " + text);
    }

    @Override
    public void err(String text) {
        writeFile("[ERR] " + text);
    }

    private void writeFile(String text) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("server.log");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(text);
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
