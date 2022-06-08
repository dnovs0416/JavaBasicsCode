package com.syntax.class09;

public class HWTask4 {

	public static void main(String[] args) {

		// Create an array on integers and calculate the sum of all elements in an array

		int[] numbers = { 10, 20, 30, 40, 50, 60 };

		int sum = 0;

		for (int num : numbers) {

			sum += num;

		}

		System.out.println(sum);

	}

}
