package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter quiz grade");
		int quiz = input.nextInt();

		System.out.println("Enter mid term grade");
		int midTerm = input.nextInt();

		System.out.println("Enter final score grade");
		int finalScore = input.nextInt();

		double average = (quiz + midTerm + finalScore) / 3;
		System.out.println("Your average grade is " + average);
		char grade;

		if (average >= 90) {
			grade = 'A';

		} else if (average >= 70 && average < 90) {
			grade = 'B';
		} else if (average >= 50 && average < 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}

		System.out.println("Your average grade is " + average);

		/* if you are A or B student --> you are doing great
		 * otherwise --> please try to study more
		 */

		if (grade == 'A' || grade == 'B') {
			System.out.println("You are doing great");

		} else {
			System.out.println("Please try to study more");
		}
	}

}
