package org.example;

import org.example.demo.pattern.Box;
import org.example.demo.pattern.Gift;
import org.example.demo.pattern.Item;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Box boxA = new Box("LargeBox");
        Box boxB = new Box("SmallBox");
        Item itemA = new Item("Umbrella");
        boxA.addGift(boxB);
        boxB.addGift(itemA);

        Box boxC = new Box("BLUE - LargeBox");
        Item itemB = new Item("TV");
        boxC.addGift(itemB);

        boxA.open();
        boxC.open();

    }
}
