package org.example.object_adapter;

public class CalculatorAdapter implements Framework {

    private OldCalculator oldCalculator = new OldCalculator();

    @Override
    public int add(int x, int y) {
        return oldCalculator.addItem(x, y);
    }
}
