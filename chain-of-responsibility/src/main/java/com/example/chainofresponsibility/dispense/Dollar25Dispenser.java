package com.example.chainofresponsibility.dispense;

public class Dollar25Dispenser implements DispenseChain{

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 25){
            int num = cur.getAmount()/25;
            int remainder = cur.getAmount() % 25;
            System.out.println("Dispensing "+num+" 25$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}
