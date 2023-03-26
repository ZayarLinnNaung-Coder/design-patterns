package com.example.widgets.dialog;

import com.example.widgets.button.Button;

public abstract class Dialog {
    public void render(){
        Button button = createButton();
        button.render();

        System.out.println("Rendering dialog...");
    }

    abstract Button createButton();
}
