package com.syntax.class04;

public class HW1Task3 {

	public static void main(String[] args) {

		int a = 15;
		int b = 25;
		int c = 35;

		if (a >= b) {
			if (a >= c) {
				System.out.println(a + " is the largest number");
			} else {
				System.out.println(c + " is the largest number");
			}
		} else {
			if (b >= c) {
				System.out.println(b + " is the largest number");
			} else {
				System.out.println(c + " is the largest number");
			}
		}
	}

}
