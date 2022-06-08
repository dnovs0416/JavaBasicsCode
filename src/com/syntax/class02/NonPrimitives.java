package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name = "Oleg";
		
		String lastName = "Smith";
		
		long phone = 1234567890l;
		
		//xxx - xxx - xxxx
		String phoneNumber = "123-456-7890";
		String address = "123 Washington st";
		
		int age = 30;
		String city = "Miami";
		city = "Los Angeles";
		
		//shortcut for printing
		//type syso +ctrl +space --> hot enter
		
		/* we can use + -> works as concatenation operator
		 * 				to attach String to String
		 * 				to attach String to int
		 * 				to attach String to double
		 * 				to any other type
		 */
		System.out.println(name+" "+lastName);//Oleg Smith
		
		//Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		
		//Oleg is 30 years old
		System.out.println(name+" is "+age+" years old");

	}

}
