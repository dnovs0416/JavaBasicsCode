package com.syntax.class08;

import java.util.Scanner;

public class HWTask2 {

	public static void main(String[] args) {

		// Write a program to ask a user to enter item they want to buy and the price of
		// that item. Every time user enters money, accumulate the amount and tell the
		// user how much is left to pay off. If user give more money program should
		// return a change. Whenever a user done with payments program should say “Thank
		// you for shopping!”

		Scanner input = new Scanner(System.in);
		String answer = null;
		double itemPrice;
		double paidAmt;
		double sum = 0;

		System.out.println("What do you want to buy?");
		answer = input.next();
		System.out.println("How much is it?");
		itemPrice = input.nextDouble();

		do {
			System.out.println("How much are you paying?");
			paidAmt = input.nextDouble();
			sum += paidAmt;
			if (itemPrice - sum > 0) {
				System.out.println("Your balance is " + (itemPrice - sum));
			}
		} while (sum < itemPrice);
		if (sum > itemPrice) {
			System.out.println("Thank you for shopping. Your change is " + (sum - itemPrice));
		} else if (sum == itemPrice) {
			System.out.println("Thank you for shopping.");
		}

	}

}
