package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {

		try (Scanner destiFile = new Scanner(System.in)) {
			System.out.println("Please enter path to save file: ");
			String pathDestiFile = destiFile.nextLine();

			File fizzBuzz300 = new File(pathDestiFile);
			String out = "";


			try (PrintWriter printWriter = new PrintWriter(fizzBuzz300)) {
				for (int i = 1; i <= 300; i++) {
					if (i % 15 == 0) {
						out = "FizzBuzz";
					} else if (Integer.toString(i).contains("3") && i % 5 == 0) {
						out = "Fizz";
					} else if (Integer.toString(i).contains("3") && Integer.toString(i).contains("5")) {
						out = "Fizz";
					} else if (i % 5 == 0) {
						out = "Buzz";
					} else if (i % 3 == 0) {
						out = "Fizz";
					} else if (Integer.toString(i).contains("5")) {
						out = "Buzz";
					} else if (Integer.toString(i).contains("3")) {
						out = "Fizz";
					} else {
						out = Integer.toString(i);
					}
					printWriter.println(out);
				}
			}



		} catch (FileNotFoundException e) {
			System.out.println("Invalid file path!");
			System.exit(1);

		}

	}

}
