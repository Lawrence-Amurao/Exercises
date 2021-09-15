package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // this creates a scanner object to the keyboard stream
        boolean isDone = false;
//        Scanner scanner = new Scanner(System.in);  no need to create a second scanner
        do {
            System.out.println("Enter the file name");
            String path = input.nextLine();  // get the string the user typed

            File inputPath = new File(path);
            try {
                Scanner fileScanner = new Scanner(inputPath);  // this creates a scanner object to the file stream
                System.out.println("File is opened for reading");
                // perhaps we add all of our code associated with reading from that file here
//                break; // take you outside of the loop
                isDone = true;
            } catch (FileNotFoundException e) {
                System.out.println("Uh oh!  File not found!");
//                System.exit(1);  // this means end the program, right here, right now.
//            e.printStackTrace();
            }

        } while(!isDone);
        System.out.println("Ending program");
    }
}
