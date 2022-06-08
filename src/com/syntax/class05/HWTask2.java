package com.syntax.class05;

import java.util.Scanner;

public class HWTask2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter city");
		String city = input.next();

		System.out.println("Please enter temperature in Fahrenheit");
		int temp = input.nextInt();

		int celsius = (temp - 32) * 5 / 9;

		System.out.println("The temperature in " + city + " is " + celsius + " Celsius");

	}

}
