package com.syntax.class08;

import java.util.Scanner;

public class LoopPractice {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<6; i++) {
			
			System.out.print(sum+" "); //0 1 3 6 10
			sum+=i;
			//System.out.println(sum); //1 3 6 10 15	
		}
		
		System.out.println();
		System.out.println(sum); //15
		
		/*
		 * write a program to find sum of all even and all odd numbers
		 * from 1 to 70
		 */
		
		System.out.println("-------------------------");
		
		int sum1=0;
		int sum2=0;
		for (int i=1; i<=70; i+=2) {
			sum1+=i;	
		}for (int i=2; i<=70; i+=2) {
			sum2+=i;
		}
		System.out.println("The sum of all odd numbers is "+sum1);
		System.out.println("The sum of all even numbers is "+sum2);
		
	}

}
