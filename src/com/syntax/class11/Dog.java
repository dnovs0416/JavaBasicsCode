package com.syntax.class11;

public class Dog {
	// Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	// Labrador with specific attributes and behaviors.

	String breed;
	String name;
	int age;
	String color;
	
	void bark() {
		System.out.println(breed + " barks");
	}
	void walk() {
		System.out.println(breed + " walks");
	}
	
	void eat() {
		System.out.println(breed + " likes to eat dog food");
	} 
	public static void main(String[] args) {
		
		Dog husky=new Dog();
		husky.breed="Husky";
		husky.name="Pakkun";
		husky.age=7;
		husky.color="Gray and White";
		husky.bark();
		husky.walk();
		husky.eat();
		
		Dog bulldog=new Dog();
		bulldog.breed="Bulldog";
		bulldog.name="Rusty";
		bulldog.age=2;
		bulldog.color="black";
		bulldog.bark();
		bulldog.walk();
		bulldog.eat();
		
		Dog labrador=new Dog();
		labrador.breed="Labrador";
		labrador.name="Milo";
		labrador.age=5;
		labrador.color="golden brown";
		labrador.bark();
		labrador.walk();
		labrador.eat();
		
	}

}
