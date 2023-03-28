package org.example.gui;

import org.example.gui.button.Button;
import org.example.gui.button.WindowsButton;
import org.example.gui.textField.TextField;
import org.example.gui.textField.WindowsTextField;

public class WindowsGUIFactory extends GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
