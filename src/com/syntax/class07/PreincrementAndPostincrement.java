package com.syntax.class07;

public class PreincrementAndPostincrement {
	
	public static void main(String[] args) {
		
		int num=10;
		//post increment
		// first use then incrememnt
		int result=num++;
		
		System.out.println("Value of num = "+num);
		System.out.println("Value of result = "+result);
		
		int num1=10;
		//preincrement
		//first increment and then use
		int result1=++num1;
		System.out.println("Value of num = "+num1);
		System.out.println("Value of result = "+result1);
		
		
	}

}
