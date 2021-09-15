package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Fibonacci sequence printer!");
		System.out.print("Please enter a number: ");
		int num = scanner.nextInt();
		int sum1 = 0;
		int sum2 = 1;
			if (num < 1) {
				System.out.println("0, 1");
				if (num == 1) {
					System.out.println("0, 1, 1");
				}
			}
		for (int i = 1; sum1 <= num; i++) {
			System.out.print(sum1 + " ");
			int sum = sum1 + sum2;
			sum1 = sum2;
			sum2 = sum;


		}



	}

}
