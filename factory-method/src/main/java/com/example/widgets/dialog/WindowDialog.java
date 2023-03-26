package com.example.widgets.dialog;

import com.example.widgets.button.Button;
import com.example.widgets.button.WindowButton;

public class WindowDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowButton();
    }
}
