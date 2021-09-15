package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityFileReader {

    public static void main(String[] args) {

//        Food food = new Food();

        File file = new File("states.txt");
        List<State> states = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String [] lineArr = line.split(",");

                String abbreviation = lineArr[0];
                String name = lineArr[1];
                long population = Long.parseLong(lineArr[2]);
                String nickname = lineArr[6];

                State state = new State(abbreviation, name, population, nickname);
                states.add(state);
            }

            System.out.println(states);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
