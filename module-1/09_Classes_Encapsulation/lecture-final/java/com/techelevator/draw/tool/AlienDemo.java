package com.techelevator.draw.tool;

public class AlienDemo {

    // method to run
    public static void main(String[] args) {

        //create an object of type Alien
        // create instance, instantiate the Alien class
        Alien mork = new Alien();

     //   mork.color = "Beige";  NOT ALLOWED because color is private
        mork.setColor("Beige");
        mork.setIsFriendly(true);
        mork.setPlanetOfOrigin("Ork");
        mork.setLanguage("Orkan");
        mork.setNumberOfAppendages(4);


        System.out.println("Alien:  \n\tPlanet of Origin: " + mork.getPlanetOfOrigin());
        System.out.println("\tColor: " + mork.getColor());
        System.out.println("\tLanguage: " + mork.getLanguage());
        System.out.println("\tNumber of limbs: " + mork.getNumberOfAppendages());
        System.out.println("\tAre they friendly? " + mork.isFriendly());

        Alien marvin = new Alien(); // calls the default constructor
        marvin.setColor("Green");
        marvin.setPlanetOfOrigin("Mars");
        marvin.setIsFriendly(false);

        printAlienInfo (marvin);

        Alien margaret = new Alien("Pink", false, "OUTER SPACE",
                "Who knows??", 4);

        printAlienInfo(margaret);
    }

    public static void printAlienInfo(Alien alien){
        System.out.println("Alien:  \n\tPlanet of Origin: " + alien.getPlanetOfOrigin());
        System.out.println("\tColor: " + alien.getColor());
        System.out.println("\tLanguage: " + alien.getLanguage());
        System.out.println("\tNumber of limbs: " + alien.getNumberOfAppendages());
        System.out.println("\tAre they friendly? " + alien.isFriendly());
    }
}
