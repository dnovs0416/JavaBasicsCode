package com.syntax.class08;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		// Create a program that will keep asking user to apply for a credit card.
		// As soon you get “yes” from a user program should stop asking.
		
		Scanner input=new Scanner(System.in);
		String answer;
		do {

			System.out.println("Did you apply for a credit card?");
			answer = input.nextLine();

		} while (!answer.equalsIgnoreCase("yes"));
	}

}
