package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/

		int numberOfExercises;
		numberOfExercises = 26;

		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

		double half = 0.5;

		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "TechElevator";

		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		int seasonsOfFirefly = 1;

		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";

		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		double pi = 3.1416;

		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/

		String myName = "Lawrence";

		System.out.println(myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

		int numberOfMouseButtons = 5;

		System.out.println(numberOfMouseButtons);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

		double percentBatteryLeft = .99;

		System.out.println(percentBatteryLeft);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int num1 = 121;
		int num2 = 27;
		int result = num1-num2;


		System.out.println(result);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/

		double double1 = 12.3;
		double double2 = 32.1;
		double doubleResult = double1+double2;

		System.out.println(doubleResult);

		/*
		12. Create a String that holds your full name.
		*/

		String myFullName = "Lawrence Amurao";

		System.out.println(myFullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/

		String helloMyFullName = "Hello, " + myFullName;

		System.out.println(helloMyFullName);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		myFullName = myFullName + " Esquire";
		System.out.println(myFullName);


		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		myFullName += " Esquire";
		System.out.println(myFullName);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String movie = "Saw";
		movie += 2;
		System.out.println(movie);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/

		movie += 0;
		System.out.println(movie);

		/*
		18. What is 4.4 divided by 2.2?
		*/
		double double3 = 4.4;
		double double4 = 2.2;
		double result2 = double3 / double4;
		System.out.println(result2);

		/*
		19. What is 5.4 divided by 2?
		*/
		double double5 = 5.4;
		int int2 = 2;
		double result3 = double5 / int2;

		System.out.println(result3);

		/*
		20. What is 5 divided by 2?
		*/
		int intResult = 5 / 2;
		System.out.println(intResult);

		/*
		21. What is 5.0 divided by 2?
		*/
		System.out.println( 5.0 / 2 );

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		System.out.println( 66.6 / 100 );

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int remainder = 5 % 2;
		System.out.println(remainder);

		/*
		24. What is 1,000,000,000 * 3?
		*/
		int result4 = 1000000000 * 3;
		System.out.println(result4); //WRONG ANSWER
		long result5 = 1000000000L * 3; // L is litral suffix needed for a long
		System.out.println(result5);

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		boolean doneWithExercises = false;
		System.out.println(doneWithExercises);

		/*
		26. Now set doneWithExercise to true.
		*/
		doneWithExercises = true;
		System.out.println(doneWithExercises);
		
	}

}
