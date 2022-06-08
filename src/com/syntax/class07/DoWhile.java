package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {

		// while loop first checks condition
		// and only then executes block of code
		int num = 1;

		while (num <= 3) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println("   ---------------------------      ");

		// do while first executes the code
		// and only then checks the condiiton
		int num1 = 1;
		do {
			System.out.print(num1 + " ");
			num1++;
		} while (num1 <= 3);

		System.out.println(" ---------------------- ");
		// print numbers 1 to 30 using do while

		int num2 = 1;
		do {
			System.out.print(num2 + " ");
			num2++;
		} while (num2 <= 30);

		// print even numbers from 70 to 30
		System.out.println(" ----------------------------- ");

		int num3 = 70;
		do {
			System.out.print(num3 + " ");
			num3-=2; //68, 66, 64 etc
		} while (num3 >= 30);
	}

}
