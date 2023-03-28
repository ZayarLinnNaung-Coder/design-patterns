package org.example.gui;

import org.example.gui.button.Button;
import org.example.gui.textField.TextField;

public abstract class GUIFactory {
    public abstract Button createButton();
    public abstract TextField createTextField();
}
