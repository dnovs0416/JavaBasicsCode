package com.syntax.class06;

import java.util.Scanner;

public class HW1Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String grade, meaning;

		System.out.println("Please enter grade:");
		grade = input.next();

		switch (grade) {

		case "A":
			meaning = "Excellent";
			break;
		case "B":
			meaning = "Good";
			break;
		case "C":
			meaning = "Average";
			break;
		case "D":
			meaning = "Bad";
			break;
		default:
			meaning = "Not Acceptable";
		}

		System.out.println(meaning);

	}

}
