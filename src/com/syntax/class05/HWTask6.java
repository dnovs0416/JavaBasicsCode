package com.syntax.class05;

import java.util.Scanner;

public class HWTask6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter quiz grade");
		int quiz = input.nextInt();

		System.out.println("Enter mid term grade");
		int midTerm = input.nextInt();

		System.out.println("Enter final score grade");
		int finalScore = input.nextInt();

		double average = (quiz + midTerm + finalScore) / 3;
		System.out.println("Your average grade is "+average);

		if (average >= 90) {
			System.out.println("Grade = A");

		} else if (average >= 70 && average < 90) {
			System.out.println("Grade = B");

		} else if (average >= 50 && average < 70) {
			System.out.println("Grade = C");

		} else if (average < 50) {
			System.out.println("Grade = F");
		}
	}

}
