package com.syntax.class08;

import java.util.Scanner;

public class HWTask1 {

	public static void main(String[] args) {

		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.

		Scanner input = new Scanner(System.in);

		System.out.println("Please provide a range of two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int sum1 = 0;
		int sum2 = 0;

		for (int a = num1; a <= num2; a++) {
			if (a % 2 == 0) {
				sum1 += a;
			}
		}
		for (int b = num1; b <= num2; b++) {
			if (b % 2 != 0) {
				sum2 += b;
			}
		}
		System.out.println("The sum of the even numbers is " + sum1);
		System.out.println("The sum of the odd numbers is " + sum2);
	}

}
