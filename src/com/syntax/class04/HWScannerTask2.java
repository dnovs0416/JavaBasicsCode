package com.syntax.class04;

import java.util.Scanner;

public class HWScannerTask2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=input.nextInt();
		
		System.out.println("Enter second number");
		int b=input.nextInt();
		
		if (a>b) {
			System.out.println(a+" is the larger number");
			
		}else if (a==b){
			System.out.println(a+" and "+b+" are equal");
			
		}else {
			System.out.println(b+" is the larger number");
		}
		
		

	}

}
