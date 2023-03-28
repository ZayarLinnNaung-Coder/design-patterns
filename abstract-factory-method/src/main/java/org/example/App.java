package org.example;

import org.example.gui.GUIFactory;
import org.example.gui.LinuxGUIFactory;
import org.example.gui.MacGUIFactory;
import org.example.gui.WindowsGUIFactory;
import org.example.gui.button.Button;
import org.example.gui.textField.TextField;

public class App {
    public static void main( String[] args ) {
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name");

        if(osName.contains("Windows")){
            guiFactory = new WindowsGUIFactory();
        } else if(osName.contains("Mac")){
            guiFactory = new MacGUIFactory();
        } else {
            guiFactory = new LinuxGUIFactory();
        }

        Button button = guiFactory.createButton();
        button.render();
        TextField textField = guiFactory.createTextField();
        textField.render();
    }
}