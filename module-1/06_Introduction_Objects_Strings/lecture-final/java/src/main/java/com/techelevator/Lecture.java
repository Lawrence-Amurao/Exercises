package com.techelevator;

import java.util.Arrays;

public class Lecture {

	public static void main(String[] args) {

		int[] myArray = new int[10];  // declares an array of 10 integers and initializes each to 0
		Arrays.fill(myArray, 42); // val: is from IJ - DON;T TYPE IT!
		// set each value in the array to hold 42
		System.out.println(myArray);  // prints out hex address of where myArray is stored in heap
		System.out.println(Arrays.toString(myArray)); // print out all values of myArray

		int[] newArray = Arrays.copyOf(myArray, 5);  // newArray will have length of 5 and hold 42
		System.out.println(Arrays.toString(newArray)); // print out the values in newArray

		newArray[1] = 13;
		newArray[3] = 4;
		newArray[4] = 29;
		System.out.println("newArray now is: " + Arrays.toString(newArray));

		Arrays.sort(newArray);  // in memory sort in ascending order
		System.out.println("newArray after sorting: " + Arrays.toString(newArray));

		if(Arrays.equals(myArray, newArray)){  // compares each element of each array to see if they are equal
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String greeting = "Hello, World";  // we tend to use this shortcut way of declaring a String
		String newGreeting = new String ("Goodbye, World");

		System.out.println(greeting);
		System.out.println(newGreeting);

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		char first = greeting.charAt(0);  // returns the 'H'
		char fourth = greeting.charAt(4);  // return the 'o'

		System.out.println("first char: " + first + " and fourth: " + fourth);

		// let's count how may o's are in newGreeting (goodbye, world)
		int count = 0;  // set up count to hold how many o's

		for (int i = 0; i < newGreeting.length(); i++){
			if (newGreeting.charAt(i) == 'o'){ // charAt returns a single character so compare with single quotes
				count++; // add 1 to count
			}
		}
		System.out.println("There are "+ count + " o's in the string: " + newGreeting);

		boolean containsWorld = greeting.contains("world");
		System.out.println("The string contains 'world': " + containsWorld);

		containsWorld = greeting.toLowerCase().contains("world");
		System.out.println("The string contains 'world' ignoring case: " + containsWorld);

		System.out.println("The string ends with 'ld': " + greeting.endsWith("ld"));

		int oPosition = newGreeting.indexOf('o');  // calling char version -- indexOf is overloaded
		System.out.println("The first o is in index: " + oPosition);

		//substring
		String subStr = greeting.substring(0,5);  //will return Hello
		System.out.println(subStr);

		String endOfString = greeting.substring(7);  // will return World -- starts in index 7 and returns to end
		System.out.println(endOfString);

		String firstName = "Margaret";  //firstName in Stack will reference or point to location in heap
										//  where 'Margaret' is stored
		firstName = "Bob";    // firstName is Stack will now point to a different location in heap where 'Bob' is stored

		System.out.println(firstName.toUpperCase());

		firstName = firstName.toUpperCase();  // actually stores "BOB" in new location in Heap

		System.out.println(firstName);

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = {'H', 'e', 'l', 'l', 'o'}; // character is different than a String
		String hello1 = new String("Hello"); // holds the address of character array stored in the heap
		String hello2 = new String("Hello"); // holds the address of character array stored in heap



		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {  // compares the stack values references or addresses!
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {  // always use the .equals method for objects!
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		if (hello1.equals(helloArray)){
			System.out.println("helloArray is equal to hello1");
		} else {
			System.out.println("helloArray is not equal to hello1");
		}

	}
}
