package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {
	private static File fileSource(String filePath) throws IOException {
		File pathOfFile = new File(filePath);

		if (!pathOfFile.exists()) {
			throw new FileNotFoundException(filePath + " does not exist!");
		} if (!pathOfFile.isFile()) {
			throw  new IOException(filePath + " is not a file!");
		}
		return pathOfFile;
	}

	public static void main(String[] args) {
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("Please enter the file path: ");
			String filePath = userInput.nextLine();

			System.out.println("Please enter the word you would like to search for: ");
			String wordEntered = userInput.nextLine();

			System.out.println("Should the search be Case Sensitive? (Y/N): ");
			String caseAnswer = userInput.nextLine();

			boolean caseSensitive = false;
			if (caseAnswer.equalsIgnoreCase("y")) {
				caseSensitive = true;
			}

			try {
				File pathOfFile = fileSource(filePath);
				try (Scanner inputFile = new Scanner(pathOfFile)) {
					int lineNumber = 1;
					while (inputFile.hasNextLine()) {
						String line = inputFile.nextLine();

						if (caseSensitive) {
							if (line.contains(wordEntered)) {
								System.out.println(lineNumber + ") " + line);
							}
						} else {
							if (line.toLowerCase().contains(wordEntered.toLowerCase())) {
								System.out.println(lineNumber + ") " + line);
							}
						}

						lineNumber++;
					}
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.exit(1);
			}
		}
	}

}
