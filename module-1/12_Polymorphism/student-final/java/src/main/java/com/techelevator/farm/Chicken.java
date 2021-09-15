package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal implements Sellable{

    public Chicken() {
        super("Chicken", "cluck");
    }

    @Override // overriding the methods from the contract (interface)
    public BigDecimal getPrice() {
        return new BigDecimal("12.00");
    }
}
