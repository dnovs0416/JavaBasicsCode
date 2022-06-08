package com.syntax.class11;

public class Phone {

	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with
	// specific attributes and behaviors.
	
	String model;
	String brand;
	String color;
	String memory;
	
	void call() {
		System.out.println(model + " will make a call");
	}
	void text() {
		System.out.println(model + " will make a text");
	}
	public static void main(String[] args) {
		
		Phone iPhone=new Phone();
		iPhone.model="Iphone 13 Pro Max";
		iPhone.brand="Apple";
		iPhone.color="Alpine Green";
		iPhone.memory="512 GB";
		iPhone.call();
		iPhone.text();
		
		Phone pixel=new Phone();
		pixel.model="Pixel 6 Pro";
		pixel.brand="Google";
		pixel.color="Stormy Black";
		pixel.memory="128 GB";
		pixel.call();
		pixel.text();
		
		Phone samsung=new Phone();
		samsung.model="Galaxy S22";
		samsung.brand="Samsung";
		samsung.color="Navy";
		samsung.memory="128 GB";
		samsung.call();
		samsung.text();
	}
	
	

}
