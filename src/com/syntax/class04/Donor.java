package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		int age=25;
		int weight=95;
		
		if (age>=18) {
			System.out.println("Patient meets age requirement");
			if (weight>=110) {
				System.out.println("Patient is eligible for donation");
				
			}else {
				System.out.println("Patient did not meet weight requirement");
			}
		}else {
			System.out.println("Patient is not eligible for donation");
		}

	}

}
