package com.techelevator.farm;

// final at class leve;
// means no child classes are allowed
public final class Cat extends FarmAnimal{
    public Cat(){
        super("Cat", "meow");
    }
  /*  @Override   // override the getSound method from parent
    public String getSound(){
        return "meow";
    }*/
}
