package com.techelevator.farm;

import java.math.BigDecimal;

public class Apple implements Sellable{
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(".49");
    }
}
