package com.techelevator.reviewCode;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Bob", 29);
        //count is static meaning only one copy of this variable no matter how many instances
        System.out.println("There are " + Person.getCount() + " person objects");
        Person sue = new Person("Sue", 29);
        Person mary =new Person("Mary", 29);
        System.out.println("There are now " + Person.getCount() + " person objects");
    }
}
