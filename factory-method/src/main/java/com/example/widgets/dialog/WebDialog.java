package com.example.widgets.dialog;

import com.example.widgets.button.Button;
import com.example.widgets.button.WebButton;

public class WebDialog extends Dialog{
    @Override
    Button createButton() {
        return new WebButton();
    }
}
