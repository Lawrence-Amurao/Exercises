package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */
		System.out.println("Enter the path of file or directory: ");
		String path = userInput.nextLine();

		File file = new File(path);

		if (file.exists()) {
			//if file or directory exists then we can look at metadata
			System.out.println("Name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());

			//Canonical and Absolute are similar, except canonical will resolve ../
			System.out.println("Canonical path: " + file.getCanonicalPath());

			System.out.println("Readable: " + file.canRead());
			System.out.println("Writeable: " + file.canWrite());

			if (file.isDirectory()) {
				System.out.println("type: directory");
				System.out.println(Arrays.toString(file.listFiles()));
			}

			if (file.isFile()) {
				System.out.println("type: file");
			}

			System.out.println("Size: " + file.length());
		} else {
			System.out.println(file.getAbsolutePath() + " does not exist.");
		}

		File newFile = new File("newFile.txt");

		try {
			newFile.createNewFile();
		} catch (IOException e) {
			System.out.println("Error creating file");
		}


	}

}
