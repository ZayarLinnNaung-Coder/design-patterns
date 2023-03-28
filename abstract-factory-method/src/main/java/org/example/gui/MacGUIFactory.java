package org.example.gui;

import org.example.gui.button.Button;
import org.example.gui.button.MacButton;
import org.example.gui.textField.MacTextField;
import org.example.gui.textField.TextField;

public class MacGUIFactory extends GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}
