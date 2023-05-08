package org.example.demo.pattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Gift{

    private String name;
    private List<Gift> giftList;

    public Box(String name){
        this.name = name;
    }

    public void addGift(Gift gift){
        if(giftList == null){
            giftList = new ArrayList<>();
        }
        giftList.add(gift);
    }

    @Override
    public void open() {
        giftList.stream().forEach(g -> {
            System.out.println("OPENING BOX..." + name);
            g.open();
        });
    }
}
