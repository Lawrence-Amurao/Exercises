package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("Arrays from yesterday");
		System.out.println("#####################");

		// create an array
		int [] myArray = { 4, 5, 6, 7};
		int [] newArray = Arrays.copyOf(myArray, 4); // copies entire array
		System.out.println("myArray: " + myArray);
		System.out.println("values: " + Arrays.toString(myArray)); // prints out all elements
		System.out.println("newArray: " + newArray);
		System.out.println("values: " + Arrays.toString(newArray));


		int [] newArray1 = Arrays.copyOf(myArray, myArray.length); // copies entire array
		String name = "Margaret";
		System.out.println(name.repeat(3));

		System.out.println("\n\n\n");  // print 3 blank lines

		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// declare and instantiate a List
		//List on left is interface = new ArrayList is the class
		List<String> names = new ArrayList<>();  // syntax to declare a List or ArrayList

		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Gandalf");

		System.out.println("Size of List: " + names.size());
		names.add(0, "Bilbo");
		System.out.println("Size is now: " + names.size());

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		System.out.println("\nThe elements in the list are: ");
		for (int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Pippin");

		printList(names);  // call a method we will write down below - send the List as an arg

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(3, "Merry");

		printList(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(5);
		printList(names);

		System.out.println("###############");
		System.out.println("Can also remove by object (in this case a String)");
		System.out.println("###############");

		names.add(0, "Sam");
		names.remove("Sam");
		printList(names);

		// how would we handle the case sensitivity??

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		if (names.contains("Bilbo")){
			System.out.println("Bilbo lives here!");
		} else {
			System.out.println("No one can find Bilbo");
		}

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfPippin = names.indexOf("Pippin");
		System.out.println("Pippin is in index: " + indexOfPippin);




		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = new String[names.size()];  // declare an empty array
		for (int i = 0 ; i < names.size(); i++){
			namesArray[i] = names.get(i);
		}

		//create an array from a List
		String[] namesArray1 = names.toArray(new String[0]); // create a new array
		//     and copy all elements into the new array

		for (int i = 0; i < namesArray1.length; i++){
			System.out.println(namesArray1[i]);
		}

		// create a List from an array
		List<String> nameList = new ArrayList<>(Arrays.asList(namesArray1));

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		names.add("BILBO");
		// Collections.sort is an in-memory method -- it will change the order of names
		Collections.sort(names);  // will sort alphabetically
		printList(names);

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);  // now will be in z-a order
		printList(names);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// in my names List, each element is a String
		for (String nameElement: names){
			System.out.println(nameElement);
		}

		// When to use the foreach loop, when to use for loop?
		// use a for loop when you need an index (need to know specific position)
		// use a for loop when you need to alter any elements
		// use a foreach loop when you are going to visit each element in the array/list

		// Create in Integer object
		Integer i = 10;  // Java is going autobox the primitive value 10 and turn into reference

		int i1 = i;  // Java will unbox that reference and turn into a primitive
		// or we could force the unboxing by using a cast
		int i2 = (int)i;

	} // end of main method

	//access modifier - public
	// optional word - static (calling method from main which is static so add it here)
	// return data type
	// method name
	// ( parameters)
	public static void printList(List<String> names){

		System.out.println("\nThe elements in the list are: ");
		for (int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}

	}
}
