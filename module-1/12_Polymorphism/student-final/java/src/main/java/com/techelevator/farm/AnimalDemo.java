package com.techelevator.farm;

public class AnimalDemo {

    public static void main(String[] args) {
                                // empty parens means no args
                                // no values being passed to
                                // the constructor
//        FarmAnimal farmAnimal = new FarmAnimal();
//        FarmAnimal farmAnimal = new FarmAnimal("", "");
//        Cow cow = new Cow();
        FarmAnimal [] farmArray = new FarmAnimal[3];
        farmArray[0] = new Cow();
        farmArray[1] = new Chicken();
        farmArray[2] = new Cow();

        for (int i = 0; i < farmArray.length; i++){
            System.out.println(farmArray[i].getName() + "  " +
                    farmArray[i].getSound());
        }

    }
}
