package com.syntax.class04;

public class Task4 {

	public static void main(String[] args) {

		double mortgageRate = 6.5;
		int mortgagePrice = 23000;

		if (mortgageRate > 4.5) {
			System.out.println("I will not buy a house");
			
		} else {
			System.out.println("I will consider buying a house");
				if (mortgagePrice > 50000) {
					System.out.println("I will take a loan");
				} else {
					System.out.println("I will pay in cash");
				}
		}

	}

}
