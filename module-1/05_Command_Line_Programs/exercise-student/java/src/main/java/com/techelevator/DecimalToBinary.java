package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Decimal to Binary Converter!");
		System.out.print("Please provide a series of decimal numbers to be converted to binary (space separated): ");
		String decimal = scanner.nextLine();

		String[] decimalArray = decimal.split(" ");
			for (int i = 0; i < decimalArray.length; i++) {
				String bin = Integer.toBinaryString(Integer.parseInt(decimalArray[i]));
				int deciInt = Integer.parseInt(decimalArray[i]);
				System.out.println(deciInt + " in Binary is " + bin);
			}

	}

}
