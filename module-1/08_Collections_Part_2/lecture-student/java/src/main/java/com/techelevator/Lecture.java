package com.techelevator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map <String, String> nameToZipCode = new HashMap<>();

		//load the map with key, value pairs
		nameToZipCode.put("Bob", "23432");
		nameToZipCode.put("Sue", "45323");
		nameToZipCode.put("Jim", "87654");
		nameToZipCode.put("Ann", "65789");
		nameToZipCode.put("Tim", "48765");

		//if I know the key, I can easily get the value;
		System.out.println("Ann lives at " + nameToZipCode.get("Ann"));

		//keys must be unique
		System.out.println("Jim lives at: " + nameToZipCode.get("Jim"));
		nameToZipCode.put("Jim", "99999"); //no error, just overwrites
		System.out.println("Jim now live at: " + nameToZipCode.get("Jim"));

		//to create a key set, you declare a Set of data type of the keys
		Set <String> keys = nameToZipCode.keySet(); // creates a set of all the keys

		for (String key: keys) { //for each String key in my collection of keys
			System.out.println(key + " lives at " + nameToZipCode.get(key));
		}
		nameToZipCode.remove("Bob");

		nameToZipCode.put("Mary", null); //adds a key with no value

		nameToZipCode.put("Tom", "44444");
		nameToZipCode.put("Bill", "55555");
		nameToZipCode.put("Jill", "44444");

		nameToZipCode.put("JIM" , "33333"); //java is CASE-sensitive -- if it looks different, it is

		System.out.println(nameToZipCode);// this is actually calling a method called toString ()
//		System.out.println(nameToZipCode.toString()); toString gives string representation of the Map

		//PRINT ALL VALUES USING ENTRY SET
		for (Map.Entry<String, String> nameZip: nameToZipCode.entrySet()) {
			System.out.println(nameZip.getKey() + " lives at " + nameZip.getValue());
		}

		if (nameToZipCode.containsKey("Jim")) {
			System.out.println("\n\nJim lives in " + nameToZipCode.get("Jim"));
		} else {
			System.out.println("\n\nSorry, Jim doesn't live anywhere");
		}

//		Set <String> keySet = nameToZipCode.keySet();
//		for (String key: keySet) {
//			if (nameToZipCode.get(key).equals("44444")) {
//				System.out.println(key);
//			}
//		}

		nameToZipCode.remove("Mary");//remove her because she has no zip code

		if (nameToZipCode.containsValue("44444")) {
			System.out.println("There are people living in 44444");
		}

		for (Map.Entry<String, String> nameZip: nameToZipCode.entrySet()) {
			if (nameZip.getValue().equals("44444")) {
				System.out.println(nameZip.getKey());
			}

		}
		System.out.println("**** Print all zipcodes for people whose name starts with 'J'");
		Set<String> keySet = nameToZipCode.keySet();
		for (String key: keySet) {
			if (key.startsWith("J")) {
				System.out.println(key + " lives in " + nameToZipCode.get(key));
			}
	//		if (key.toLowerCase().startsWith("j")) { works as well
		}
	}

}
