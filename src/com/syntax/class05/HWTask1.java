package com.syntax.class05;

import java.util.Scanner;

public class HWTask1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is the amount of loan that you need?");
		int amount = input.nextInt();

		if (amount <= 200000) {
			System.out.println("I will lend you the money");
		} else {
			System.out.println("I will reject");
		}

	}

}
