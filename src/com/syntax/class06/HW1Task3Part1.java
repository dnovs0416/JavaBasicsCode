package com.syntax.class06;

import java.util.Scanner;

public class HW1Task3Part1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Calculator");
		double num1 = input.nextDouble();
		char operator = input.next().charAt(0);
		double num2 = input.nextDouble();

		double answer = 0;

		if (operator == '+') {
			answer = (num1 + num2);
		} else if (operator == '-') {
			answer = (num1 - num2);
		} else if (operator == '*') {
			answer = (num1 * num2);
		} else if (operator == '/') {
			answer = (num1 / num2);
		}
		
		System.out.println("The answer is "+answer);
		

	}

}
