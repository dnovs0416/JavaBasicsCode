package com.syntax.class09;

public class HWTask2 {

	public static void main(String[] args) {

		// Create an array of animals and store 5 elements into it. 
		// Using 2 different loops print all elements from the array.
		
		String[] animals = { "dog", "cat", "mouse", "bird", "hedgehog"};
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		
		System.out.println();
		
		for (String animal : animals) {
			System.out.print(animal + " ");
		}

	}

}
