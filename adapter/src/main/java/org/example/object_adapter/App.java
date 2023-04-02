package org.example.object_adapter;

public class App {
    public static void main(String[] args) {
        Framework framework = new CalculatorAdapter();
        int result = framework.add(10, 20);
        System.out.println(result);
    }
}
