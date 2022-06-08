package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {

		// from an array of integer elements find the largest number

		int[] numbers = { 5, 10, 35, 7, 25, 100 };
		int largestNumber = 0;

		for (int num : numbers) {
			if (num > largestNumber)
				largestNumber = num;
		}
		System.out.println("The largest number is " + largestNumber);

		System.out.println("-------------------");

		int[] array = { 5, 28, 36, 1, 14, 56, 48, 17 };

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The largest element is " + max);

	}

}
