package com.techelevator.farm;

public class AnimalDemo {

    public static void main(String[] args) {
        FarmAnimal [] farmArray = new FarmAnimal[3];
        farmArray[0] = new Cow();
        farmArray[1] = new Chicken();
        farmArray[2] = new Cow();

        for (int i = 0; i < farmArray.length; i++) {
            System.out.println(farmArray[i].getName() + " " + farmArray[i].getSound());
        }
    }
}
