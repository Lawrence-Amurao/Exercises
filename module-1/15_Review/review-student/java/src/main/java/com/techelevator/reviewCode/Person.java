package com.techelevator.reviewCode;

public class Person {
    //attributes
    //always private
    private String name;
    private int age;
    //final means a constant - constants are declared all in CAPS
    //must initialize when declaring
    //it will be public so we don't need a getter tp access to value
    public static final String WORDS = "Joe's Garage";

    //static variable called count
    public static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++; //this will count how many Person objects are created
    }

    // setters are also called mutators because they change the data
    public String getName() { // getters are also called accessors
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getCount() {
        return count;
    }
}
