package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {
    private BigDecimal price;

    public Pig() {
        super("Pig", "oink!");
        price = new BigDecimal("300.00");
    }

    @Override
    public String getName(){
        return "Wilbur";
    }
    public String getNameAndAnimal(){
        String animal = super.getName();
        return animal + " " + this.getName();
    }
    public BigDecimal getPrice() {
        return price;
    }
}