package com.techelevator.farm;

// an interface is a contract
public interface Singable {
    // any class that implements (fulfills) this contract
    // must provide the bodies for the following methods
    // interface provide abstract methods
    // abstract method is one that doesn't provide a body
    public String getName(); // no body, ends with with ;
    // all abstract methods are public
    String getSound();

    // example -- you can pass in params
    // String abstractMethod(int num1, double num2, String var1);
}
