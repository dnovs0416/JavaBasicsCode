package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Does user have a credit card?: Yes or No");
		String answer=input.next();
		
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("What is the balance on the card?");
			int balance=input.nextInt();
			
			if (balance>=1000) {
				System.out.println("You should pay off immediately");
			}else {
				System.out.println("You can spend more");
			}
		}else if (answer.equalsIgnoreCase("No")){
			System.out.println("You should have one");
		}

	}

}
