package com.techelevator.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OldMacdonald {
	public static void main(String[] args) {

//		FarmAnimal[] farmAnimals = new FarmAnimal[4];

		List<FarmAnimal> farmAnimals =
				new ArrayList<>(Arrays.asList(new Cow(), new Chicken(),
						new Dog(), new Dingo(), new Chicken()));


		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}


		List<Singable> singables = new ArrayList<>();
		singables.add(new Dingo());
		singables.add(new Chicken());
		singables.add(new Tractor());

		for (Singable singAbout : singables) {
			String name = singAbout.getName();
			String sound = singAbout.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

//		Singable myObject = new Singable();  // cannot have concrete object of an interface
		// program to the interface
		Singable myObject = new Tractor();

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("What would you like to buy today?");
			System.out.println("1. Chickens");
			System.out.println("2. Apples");
			System.out.println("3. Tractor");
			System.out.print("Enter your choice: ");  // print says prompt on same line as question
			int choice = Integer.parseInt(scanner.nextLine()); // pick up user input and convert to int
			// don't user scanner.nextInt()!
			if (choice == 1) {
				Chicken chicken = new Chicken();
				System.out.println("A chicken costs: " + chicken.getPrice());
				break; // pop out of the loop!
			} else if (choice == 2) {
				Apple apple = new Apple();
				System.out.println("Each apple costs: " + apple.getPrice());
				break;
			} else if (choice == 3) {
				Tractor tractor = new Tractor();
				System.out.println("Hey, Big Spender!  That tractor will cost you: " + tractor.getPrice());
				break;
			} else {
				System.out.println("INVALID ENTRY!!!");
			}

		} while (true);
	}
}