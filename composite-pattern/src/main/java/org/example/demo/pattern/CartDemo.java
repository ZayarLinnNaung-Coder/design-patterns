package org.example.demo.pattern;

import org.example.Cart;

public class CartDemo {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Long currentTime = System.currentTimeMillis();

//        Double amount = new Double(0);
        double amount = 0;

        for(int i = 0; i <= 500000; i++){
            amount += i;
        }

        cart.setAmount(amount);

        Long finalTime = System.currentTimeMillis() - currentTime;

        System.out.println(finalTime);
        System.out.println(cart);
    }
}
