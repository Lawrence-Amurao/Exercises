package com.techelevator.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OldMacdonald {
	public static void main(String[] args) {

//		FarmAnimal[] farmAnimals = new FarmAnimal[4];

		List<FarmAnimal> farmAnimals =
				new ArrayList<>(Arrays.asList(new Cow(), new Chicken(), new Dog(), new Dingo(), new Chicken()));

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

			Scanner scanner = new Scanner(System.in);
		}
	}
}