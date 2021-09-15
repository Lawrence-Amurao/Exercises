package com.techelevator.farm;

// abstract at class level means no concrete objects
public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	// new attribute
	private boolean isAsleep;
	// public means don't need a getter to get the value in FARM_NAME
	// static means only one copy - belongs to the class
	// final means once value is set, can't be reassigned
	// final means CONSTANT - and typically ALL CAPS!
	public static final String FARM_NAME = "Old MacDonald's Farm";


	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		isAsleep = false;  // animals by default are awake
	}

	// this abstract method means all child classes
	// must provide this method body (override)
//	public abstract void eat();
	public void sleep(){
		isAsleep = true;
		sound = "Zzzzzz....";  // change sound to be animal sleeping
	}

	public String getName( ) {
		return name;
	}

	// final says no child class can override this method.
	public final String getSound( ) {
		return sound;
	}

}