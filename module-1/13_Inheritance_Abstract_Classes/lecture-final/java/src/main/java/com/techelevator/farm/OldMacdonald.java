package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		System.out.println(FarmAnimal.FARM_NAME);
		FarmAnimal[] singables =  // changed to be an array of FarmAnimals
				new FarmAnimal[] {new Cow(), new Chicken(), new Lamb(),
				new Cat()};  // add our cat to the array of FarmAnimals

		for (FarmAnimal animal : singables) {
			animal.sleep();
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}

		// cannot have concrete object of interface
//		Singable singable = new Singable();

//		FarmAnimal animal = new FarmAnimal("", "");
	}
}