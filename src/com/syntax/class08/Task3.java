package com.syntax.class08;

public class Task3 {
	
	public static void main(String[] args) {
		
		//Print even numbers from 20 to 1 (2 ways)
		
		//1st
		
		for (int num=20; num>=1; num--) {
			if (num%2==0) {
				System.out.print(num+" ");
			}
		}
		
		System.out.println();
		//2
		
		for (int num=20; num>=1; num-=2) {
			System.out.print(num+" ");
		}
	}

}
