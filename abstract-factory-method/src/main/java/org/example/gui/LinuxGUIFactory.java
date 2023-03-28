package org.example.gui;

import org.example.gui.button.Button;
import org.example.gui.button.LinuxButton;
import org.example.gui.textField.LinuxTextField;
import org.example.gui.textField.TextField;

public class LinuxGUIFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }
}
