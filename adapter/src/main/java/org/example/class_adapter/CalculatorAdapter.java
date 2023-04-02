package org.example.class_adapter;

public class CalculatorAdapter extends OldCalculator implements Framework{
    @Override
    public int add(int x, int y) {
        return this.addItem(x, y);
    }
}
