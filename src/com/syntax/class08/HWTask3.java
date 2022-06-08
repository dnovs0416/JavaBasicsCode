package com.syntax.class08;

public class HWTask3 {

	public static void main(String[] args) {

		// Using nested loop, create a 24 hour clock that will display 2 digits for an
		// hour and 2 digits for a minute.

		for (int a = 0; a <= 23; a++) {

			for (int b = 0; b <= 5; b++) {

				for (int c = 0; c <= 9; c++) {
					

					if (a < 10) {

						System.out.println("0" + a + ":" + b + "" + c);

					} else {

						System.out.println(a + ":" + b + "" + c);

					}

				}
			}
		}

		System.out.println("-------------------");

		for (int a = 0; a <= 2; a++) {

			for (int b = 0; b <= 9; b++) {

				if (a == 2 && b == 4) {
					break;
				}

				for (int c = 0; c <= 5; c++) {

					for (int d = 0; d <= 9; d++) {

						System.out.println(a + "" + b + ":" + c + d);
					}
				}
			}
		}
	}
}
