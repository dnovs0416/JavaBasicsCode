package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter age");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("Customer will be issued Driver's Licence");
		}else {
			System.out.println("Customer will be issued Learner's Permit");
		}

	}

}
