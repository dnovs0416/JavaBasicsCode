package com.syntax.class09;

public class HWTask3 {

	public static void main(String[] args) {

		// Create an array to store double values
		// and then print all elements using 2 different loops

		double[] numbers = { 2.99, 3.99, 4.99, 5};

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}

		System.out.println();

		for (double num : numbers) {
			System.out.print(num + " ");
		}
	
	}

}
