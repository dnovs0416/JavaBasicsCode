package com.syntax.class02;

public class ArithmeticHW {

	public static void main(String[] args) {
		
		double num1 = 5.69;
		double num2 = 3.82;
		double sum, sub, mult, div;
		
		sum = num1+num2;
		sub = num1-num2;
		mult = num1*num2;
		div = num1/num2;
		
		System.out.println("The sum of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The difference of 2 numbers "+num1+" and "
							+num2+" is equal to "+sub);
		System.out.println("The product of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The quotient of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		
		double num3 = 3.9;
		double square = num3*num3;
		
		System.out.println("The square of "+num3+" is "+square);
		
		int w = 5;
		int h = 8;
		int perimeter, area;
		perimeter = 2*(w+h);
		area = w*h;
		
		System.out.println("The perimeter of a rectangle with width "+w+" and height "
		+h+" is equal to "+perimeter+" and the area is "+area);
		

	}

}
