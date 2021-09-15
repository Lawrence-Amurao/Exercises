package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args)  {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */
		System.out.print("Enter the path of a file or directory>>> ");
		String path = userInput.nextLine();

		File file = new File(path);

		if (file.exists()) {
			//if the file or directory exists we can look at metadata
			System.out.println("Name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());

			// Canonical and Absolute are similar, except canonical will resolve ../
			try {
				System.out.println("Canonical path: " + file.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("Readable: " + file.canRead());
			System.out.println("Writeable: " + file.canWrite());

			if (file.isDirectory()){
				System.out.println("type: directory" );
				System.out.println(Arrays.toString(file.listFiles()));
			}

			if (file.isFile()){
				System.out.println("type: file");
			}

			System.out.println("Size: " + file.length());  // length returns how many bytes
		} else {
			System.out.println(file.getAbsolutePath() + " does not exist.");
		}
		// Let's create a new file
		System.out.print("Enter the file you wish to create>>> ");
		String newPath = userInput.nextLine();
		File newFile = new File(newPath);  // this creates a Java File object
		// File newFile = new File ("newFile.txt");  // if you don't want use input
		// Must be in a try catch (or add throws IOException on the method header)
		try {
			newFile.createNewFile();  // this actually creates the file in the OS
		} catch (IOException e) {  // perhaps the disk is full???
			System.out.println("Error creating file");
		}

		// Create a new Directory
		System.out.print("Enter the path of the new Directory>>> ");
//		String directoryPath = userInput.nextLine();

		File newDirectory = new File(userInput.nextLine());

		if (newDirectory.exists()){
			System.out.println("Sorry, directory already exists");
		} else {
			// newDirectory.mkdir() -- will create a new directory and return true if was able to
			if (newDirectory.mkdir()){
				System.out.println("New directory created!");
			}
			else {
				System.out.println("Unable to create directory");
				// depending on what are going to do with directory, maybe end?
				System.exit(1);   // will end the program
			}
		}
								// File constructor 2 params
								// first is the directory or path
								// second is the file name to be created
		File fileInDirectory = new File("directory", "childFile.txt");

		try {
			fileInDirectory.createNewFile();

			// either put code to write to this file HERE or exit in the catch clause
		} catch (IOException e) {
			System.out.println("File could not be created!");
			System.exit(1); // end so we don't try to write to a file that doesn't exist
		}

		// at this point in the code childFile.txt must exist

		// try with resources will automatically flush content from buffer to file
		// and also close file at end of process
		try (PrintWriter writer = new PrintWriter(fileInDirectory)) {
			String choice = "";
			do {
				System.out.print("Enter text to write to file>>> ");
				String input = userInput.nextLine();

				writer.println(input);  // write each line from user on its own line

				// ask if they want to enter more
				System.out.println("Do you wish to enter more text? (y/n)");
				choice = userInput.nextLine().toLowerCase();
			} while (choice.charAt(0) == 'y');

		}catch (FileNotFoundException e){
			System.out.println("File not found!!");
		}



	}

}
