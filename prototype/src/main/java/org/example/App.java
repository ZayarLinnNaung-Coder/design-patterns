package org.example;

import org.example.model.Employee;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Zayar Linn Naung", 23, "???");
        Employee e2 = (Employee) e1.reproduce();
        System.out.println(e1);
        System.out.println(e2);
    }
}
