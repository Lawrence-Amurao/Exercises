package com.techelevator;



public class DemoFile {

    public static void main(String[] args){
        double[] prices = new double[10]; // declared array of doubles - 10 doubles

        prices[2] = 4.99;
        prices[5] = 7.99;
        prices[4] = 42.99;
        prices[8] = 1.99;


//        prices[11] = 4.49;  this will cause a runtime exception - index out of bounds

        // oldie but the goodie -- for loop
        for (int i = 0; i < prices.length; i++){
            double p = prices[i];
            System.out.println("Index: " + i + "   value: " + p);
        }

        System.out.println("\nNow printing out values using for loop");

        // for each loop -- we don't easily have the ability to print the index
        // for (data type each element is in the array and variable name: array name)
        for (double p: prices){
            System.out.println("Value: " + p);  // p holds each value from the array
        }

        System.out.println("Print all values greater than $5.00");
        for (double price: prices){
            if (price > 5.00){
                System.out.println("$" + price);
            }
        }

        System.out.println("Print all value less than $10.00");
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < 10.00){
//                System.out.println("$" + prices[i]);
                System.out.printf("Amount: $%.2f\n", prices[i]);  // formats to 2 decimal places
            }
        }

        //fully qualified name - spell out in what package to find the class
        java.util.List<Integer> ages = new java.util.ArrayList<>();

        ages.add(29);
        ages.add(39);
        ages.add(15);
        ages.add(45);

        System.out.println("Printing ages from our array");
        for (int a: ages){  // java will unbox the Integer ages[0] and turn it into int a
            System.out.println(a);
        }  // unboxing turns reference into primitive - moves from the heap to the stack

        int age = 26;  // primitive
        ages.add(age);  // java will autobox for us -- turn the primitive into reference

    }
}
