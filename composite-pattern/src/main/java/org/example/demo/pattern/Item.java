package org.example.demo.pattern;

public class Item implements Gift{

    private String name;

    public Item(String name){
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("BOOM YA.. HAHA -> " + name);
    }
}
