package com.techelevator.farm;

public class FarmAnimalDemo {

    public static void main(String[] args) {
        //once FarmAnimal became abstract this code no longer works
//        FarmAnimal farmAnimal = new FarmAnimal("Horse", "neigh");
//
//        System.out.println("Name: " + farmAnimal.getName());
//        System.out.println("Sound: " + farmAnimal.getSound());


        Pig pig = new Pig();
        System.out.println("Name: " + pig.getName());
        System.out.println("Sound: " + pig.getSound());
        System.out.println(pig.getNameAndAnimal());
    }
}
