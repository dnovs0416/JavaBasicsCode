package com.syntax.class08;

public class Task4 {
	
	public static void main(String[] args) {
		
		//Print odd numbers between 20 and 50 (2ways)
		
		//1
		for (int num=20; num<=50; num++) {
			if (num%2!=0) {
				System.out.print(num+" ");
			}
		}
		
		//2
		System.out.println();
		
		for (int num=21; num<50; num+=2) {
				System.out.print(num+" ");
			
		}
	}

}
