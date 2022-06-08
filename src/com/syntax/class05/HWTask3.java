package com.syntax.class05;

import java.util.Scanner;

public class HWTask3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter years worked");
		int years = input.nextInt();

		if (years >= 5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("Enter annual salary");
			int salary = input.nextInt();

			if (salary >= 50000) {
				System.out.println("Bonus = 5000");
			} else {
				System.out.println("Bonus = 3000");
			}
		} else {
			System.out.println("Not eligible for bonus");
		}

	}

}
