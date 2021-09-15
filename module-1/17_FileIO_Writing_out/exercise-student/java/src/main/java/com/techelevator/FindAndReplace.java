package com.techelevator;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class FindAndReplace {
    private static File fileSource(String sourceFile) throws IOException {
        File pathOfFile = new File(sourceFile);

        if (!pathOfFile.exists()) {
            throw new FileNotFoundException(sourceFile + " does not exist!");
        } if (!pathOfFile.isFile()) {
            throw new IOException(sourceFile + " is not a file!");
        }
        return pathOfFile;

    }

    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the word to search for (Case Sensitive): ");
        String origWord = userInput.nextLine();

        System.out.print("Please enter the replacement word: ");
        String newWord = userInput.nextLine();

        System.out.println("Please enter the path to source file: ");
        String sourceFile = userInput.nextLine();
        File pathOfFile = new File(sourceFile);

        System.out.println("Please enter path to new file: ");
        String destiFile = userInput.nextLine();
        File pathDestiFile = new File(destiFile);


        if (!pathDestiFile.exists()) {
            try {
                pathDestiFile.createNewFile();
                Path path = Paths.get(String.valueOf(pathOfFile));
                Path destiPath = Paths.get(String.valueOf(pathDestiFile));
                Charset charset = StandardCharsets.UTF_8;

                String content = new String(Files.readAllBytes(path), charset);
                content = content.replaceAll(origWord, newWord);
                Files.write(destiPath, content.getBytes(charset));
                System.out.println("New file (" + pathDestiFile + ") has been created with requested changes.");
                System.exit(0);

            } catch (IOException e) {
                System.out.println("Error creating file!");
                System.exit(1);
            }


        } else {
            try {
                Path path = Paths.get(String.valueOf(pathOfFile));
                Path destiPath = Paths.get(String.valueOf(pathDestiFile));
                Charset charset = StandardCharsets.UTF_8;

                String content = new String(Files.readAllBytes(path), charset);
                content = content.replaceAll(origWord, newWord);
                Files.write(destiPath, content.getBytes(charset));
                System.out.println("Existing file (" + pathDestiFile + ") successfully overwritten.");
                System.exit(0);

            } catch (IOException e) {
                System.out.println("Error overwriting existing file!");
                System.exit(1);
            }

        }

    }



}
