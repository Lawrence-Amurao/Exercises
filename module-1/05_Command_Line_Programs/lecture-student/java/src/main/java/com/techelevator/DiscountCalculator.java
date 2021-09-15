package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        System.out.print("Enter the discount amount (ex. 20): ");
        String discountStr = scanner.nextLine();
        double discount = Double.parseDouble(discountStr) / 100;
        // The answer needs to be saved as a double
        // System.out.print("Enter the discount amount (w/out percentage): ");



        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String prices = scanner.nextLine();
        //System.out.println("Discount: " + discount + "   Prices: " + prices);

        String[] priceArray = prices.split(" ");
        for (int i = 0; i < priceArray.length; i++) {
        //    System.out.println(priceArray[i]);
            double originalPrice = Double.parseDouble(priceArray[i]);

            double discountAmount = originalPrice * discount;

            double salesPrice = originalPrice - discountAmount;
            System.out.println("Original Price: " + originalPrice + "   Sale price: " + salesPrice);


        }






    }

}