package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MovieRental> rentalList = new ArrayList<>();
		File data = new File("MovieInput.csv");

		try (Scanner scanner = new Scanner(data)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] lineArr = line.split(",");
				String title = lineArr[0];
				String format = lineArr[1];
				boolean isPremium = Boolean.parseBoolean(lineArr[2]);
				MovieRental rental = new MovieRental(title, format, isPremium);
				rentalList.add(rental);
				System.out.println(rental);
/*          System.out.println(rental.getTitle());
            System.out.println(rental.getFormat());
            System.out.println(rental.isPremium());
            System.out.println(rental.getRentalPrice().setScale(2, RoundingMode.HALF_UP));
*/
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BigDecimal total = BigDecimal.ZERO;
		for (MovieRental rental : rentalList) {

			total = total.add(rental.getRentalPrice());
		}
		System.out.println("********************************");
		System.out.println("Total: $" + total);
	}
}
