package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {

		boolean diploma = false;
		double gpa = 2;

		if (diploma) {
			System.out.println("Congratulations");

				if (gpa >= 3.5) {
					System.out.println("You are eligible for scholarship");
				} else {
					System.out.println("You should have studied harder");
				}
		} else {
			System.out.println("Get a degree");
		}

	}

}
