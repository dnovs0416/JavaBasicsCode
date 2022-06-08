package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Is there a sale: yes or no");
		String answer = input.next();

		if (answer.equalsIgnoreCase("yes")) {
			input.nextLine();
			System.out.println("What do you want to buy?");
			String item = input.nextLine();

			double price = 0;
			double discount = 0;
			double discountedPrice = 0;

			switch (item.toLowerCase()) {

			case "phone case":
				price = 15.99;
				break;
			case "earphones":
				price = 89.99;
				break;
			case "tv":
				price = 449.99;
				break;
			case "macbook":
				price = 1149.99;
				break;

			}

			System.out.println("The price of " + item + " is $" + price);

			if (price < 20) {
				discount = 10;
			} else if (price >= 20 && price < 100) {
				discount = 20;
			} else if (price >= 100 && price <= 500) {
				discount = 30;
			} else {
				discount = 50;
			}

			discountedPrice = ((100 - discount) * price) / 100;
			discountedPrice = Math.round(discountedPrice * 100.0) / 100.0;
			System.out.println("After the discount of " + discount + "% " + 
								" the price of the item is reduced from $"
								+ price + " to $" + discountedPrice);
		} else {
			System.out.println("There is no sale");
		}
	}

}
