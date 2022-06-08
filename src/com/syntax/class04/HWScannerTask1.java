package com.syntax.class04;

import java.util.Scanner;

public class HWScannerTask1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String name=input.next();
		
		
		System.out.println("Enter your last name");
		String lastName=input.next();
		
		System.out.println("Enter state");
		String state=input.next();
		
		System.out.println("My name is "+name+" "+lastName+" from "+state);

	}

}
