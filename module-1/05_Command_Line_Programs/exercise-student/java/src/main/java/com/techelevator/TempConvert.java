package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Converter!");
		System.out.print("Please enter the temperature: ");
		String temp = scanner.nextLine();
		double tempEntered = Double.parseDouble(temp);
		System.out.print("Is the measurement in (C)elsius, or (F)arenheit?: ");
		String tempType = scanner.nextLine();
		double answer;

		if (tempType.equals("C")) {
			answer = (tempEntered * 1.8 + 32);
			System.out.println(temp + "C is " + answer + "F");

		}
		else if (tempType.equals("F")) {
			answer = (tempEntered - 32) / 1.8;
			System.out.println(temp + "F is " + answer + "C");
		}

	}

}
