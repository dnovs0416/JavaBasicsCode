package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter birth month");
		String month = input.next();

		String season;

		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";

		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";

		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";

		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else {
			season = "Invalid";
		}

		if (!season.equals("Invalid")) {
			System.out.println("You were born in " + season);
		}
	}
}
