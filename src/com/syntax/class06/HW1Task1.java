package com.syntax.class06;

import java.util.Scanner;

public class HW1Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String country, language;

		System.out.println("Please enter country");
		country = input.nextLine();

		switch (country.toLowerCase()) {

		case "usa":
			language = "English";
			break;
		case "philippines":
			language = "Tagalog";
			break;
		case "mexico":
			language = "Spanish";
			break;
		case "argentina":
			language = "Portuguese";
			break;
		case "japan":
			language = "Japanese";
			break;
		default:
			language = "Unknown";
		}

		System.out.println("In the country " + country + " they speak " + language);

	}

}
