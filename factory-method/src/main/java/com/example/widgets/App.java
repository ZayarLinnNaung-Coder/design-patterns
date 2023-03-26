package com.example.widgets;

import com.example.widgets.dialog.Dialog;
import com.example.widgets.dialog.WindowDialog;

public class App {
    public static void main(String[] args) {
        Dialog dialog = new WindowDialog();
        dialog.render();
    }
}
