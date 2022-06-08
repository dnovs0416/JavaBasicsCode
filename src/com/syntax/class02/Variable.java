package com.syntax.class02;

public class Variable {

	public static void main(String[] args) {
		//part a
		String name = "Dave";
		String lastName = "Novales";
		System.out.println("My name is "+name+" and my last name is "+lastName);
		
		char grade = 'A';
		System.out.println("I am an "+grade+" student");
		
		String city = "Fishers";
		String state = "IN";
		System.out.println("I live in city "+city+" and state "+state);
		
		String phone = "123-456-7890";
		System.out.println("And my phone number is "+phone);
		
		//part b
		city = "Sterling";
		state = "VA";
		grade = 'B';
		phone = "098-765-4321";
		System.out.println("My name is "+name+" "+lastName+
				" and I moved to new city "+city+" and new state "
				+state+"."+" My new phone number is "+phone);
		
		/*
		 * Rules for identifiers
		 * 1. no space
		 * 2. no keywords
		 * 3. cannot start with numbers (numbers can be used after the letter)
		 * 4. cannot have special characters (except _, $)
		 */
		
		//String break = "Hello"; error
		//int 1number1 = 10; error
		
		int number1 = 10;
		
		//int num% = 20; error
		double $price = 3.99;
		float f_ = 2.09f;
		
		/*
		 * Naming Conventions:
		 * follow camel casing
		 * variable/methods names should start with lowercase and then follow camelcasing
		 * class names should start with uppercase
		 */
		
		String mycity = "Tysons";
		
	}

}
