package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Linear Converter!");
		System.out.print("Please enter the length: ");
		String length = scanner.nextLine();
		double lengthEntered = Double.parseDouble(length);
		System.out.print("Is the measurement in (m)eter, or (f)eet?: ");
		String measType = scanner.nextLine();
		double answer;

		if (measType.equals("f")) {
				answer = (lengthEntered * 0.3048);
				System.out.println(length + " feet in meters is " + answer);

			}
			else if (measType.equals("m")) {
				answer = (lengthEntered * 3.2808399);
				System.out.println(length + " meters in feet is " + answer);
			}

	}

}
