package com.techelevator.farm;

import java.math.BigDecimal;

//  you can implement as many interfaces as you want
// you can only extend from one class (one parent)
public class Tractor implements Singable, Sellable{
    // when Tractor is going to fulfill the
    // Singable contract, it will override
    // the abstract versions in Singable
    @Override
    public String getName() {
        return "Tractor";
    }

    @Override // overriding the abstract method
    public String getSound() {
        return "rumble-rumble";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("30000.00");
    }
}
