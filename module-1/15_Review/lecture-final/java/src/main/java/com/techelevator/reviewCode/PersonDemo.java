package com.techelevator.reviewCode;

public class PersonDemo {

    public static void main(String[] args){
        Person person = new Person("Bob", 29);
        // count is static meaning only one copy of this variable no matter how many instances
        System.out.println("There are " + Person.getCount() + " person objects");
        Person sue = new Person("Sue", 29);
        System.out.println(sue.getName());
        Person mary = new Person ("Mary", 29);
        System.out.println("There are now " + Person.getCount() + " person objects");

        PersonDemo obj = new PersonDemo();
        obj.stuff();
        //stuff(); -- have to have an object in order to call!



     //   PersonDemo.anotherMethod();
        anotherMethod();


        // ternary operator - shorthand for an if else loop
/*        if (x < 5){
            return true;
        }
        else {
             return false;
        }*/
//        return (x < 5) ? true: false;
        // return x < 5;
        int [] numArray = { 4, 6, 1, 2, 34, 7, 89, 1 ,42};
        int min = numArray[0];  // priming read
        for(int i = 1; i < numArray.length; i++){
                // condition        ? true   : false
            min = numArray[i] < min ? numArray[i]: min;
         /*   if (numArray[i] < min) {
                min = numArray[i];
            } else {
                min = min;
            }*/
        }
        System.out.println("Smallest value is " + min);

        System.out.println(Math.pow(6, 3));

        double random = Math.random(); //returns a number between 0 and 1
        for (int i = 0; i < 100; i++) {
            int guess10 = (int) (Math.random() * 10);  // returns the int
            // between 0 and 9
            System.out.println(guess10);
        }

        System.out.println("Now numbers between 1 and 10");
        for (int i = 0; i < 100; i++) {
            int guess10 = ((int) (Math.random() * 10) + 1);  // returns the int
            // between 1 and 10
            System.out.println(guess10);
        }

        for (int i = 0; i < 100; i++) {
            int guess10 = (int) Math.ceil( (Math.random() * 10));  // returns the int
            // between 1 and 10
            System.out.println(guess10);
        }
    }

    // because it is NOT static, it is an instance method
    // means you have to have instance (object) in order to call method
    public void stuff(){
        System.out.println("In the stuff method");
    }

    public static void anotherMethod(){
        System.out.println(" Inside another method ");
    }
}
