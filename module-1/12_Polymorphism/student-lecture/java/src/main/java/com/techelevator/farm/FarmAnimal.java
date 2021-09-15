package com.techelevator.farm;

public class FarmAnimal implements Singable{
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound) {
//		System.out.println("in Farm animal");
		this.name = name;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

}