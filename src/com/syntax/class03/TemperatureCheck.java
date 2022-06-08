package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		/*
		 * when your code has no errors always try to format it
		 * 
		 * mac cmd+shift+f widows ctrl+shift+f
		 */

		int temperature = 18;

		if (temperature < 32) {

			System.out.println("Water will freeze with temperature " + temperature);
			System.out.println("It is cold outside");
			System.out.println("Make sure to use jacket and scarf");

		} else {

			System.out.println("Water will NOT freeze with temperature " + temperature);
			System.out.println("It is not that cold outside then");
		}
		
		System.out.println("Continues code");
		System.out.println("I am code outside of if block");

	}

}
