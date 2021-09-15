package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class DemoFile {

    public static void main(String[] args) {
        double[] prices = new double[10]; //declared array of 10 doubles

        prices[2] = 4.99;
        prices[5] = 7.99;
        prices[4] = 42.99;
        prices[8] = 1.99;

        //for loop
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Index: " + i + "   value: " + prices[i]);
        }

        System.out.println("\nNow pringting out values using for loop");
        //for each loop -- we don't easily have the ability to print the index
        //for (data type each elemnt is in the array and variable name: array name)
        for (double p: prices) {
            System.out.println("Value: " + p); // p holds each value from the array

        }

        System.out.println("Print all values greater than $5.00");
        for (double price: prices) {
            if (price > 5.00) {
                System.out.println(price);
            }
        }

        System.out.println("Print all values less than $10.00");
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 10.00) {
             //   System.out.println("$" + prices[i]);
                System.out.printf("$%.2f\n", prices[i]); // formats to 2 decimal places
            }
        }

        //fully qualified name - spell out what package to find in class
        java.util.List <Integer> ages = new java.util.ArrayList<>();

        ages.add(29);
        ages.add(39);
        ages.add(15);
        ages.add(45);

        System.out.println("Printing ages from our array");
        for (int a: ages) { //java will unbox the integer ages[0] and turn it into int a
            System.out.println(a);

        } //unboxing turns reference into primitive - moves from the heap to the stack

        int age = 26; // primitive
        ages.add(age); // java will auto box -- turn primitive into reference -- move from stack to heap


    }
}
