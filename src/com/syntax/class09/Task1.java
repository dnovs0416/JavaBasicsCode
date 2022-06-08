package com.syntax.class09;

public class Task1 {
	
	public static void main(String[] args) {
		
		char[] grades=new char[6];
		grades [0]= 'A';
		grades [1]= 'B';
		grades [2]= 'C';
		grades [3]= 'D';
		grades [4]= 'E';
		grades [5]= 'F';
		
		//System.out.println(grades[1]);
		
		char[] grade= {'A', 'B', 'C', 'D'};
		/*
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		*/
		
		for (int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		
		System.out.println();
		
		String[] words= {"Java", "Saturday", "day"};
		
		//I want to retrieve all elements
		
		for (int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		
		/* Enhanced for loop/ advanced for loop/ for each loop
		   CAN BE USED ONLY FOR WHEN WE WORK WITH ARRAY
		   				OR
		   			COLLECTION
		 */
		
		String[] colors= {"pink", "blue", "white", "black"};
		
		for(String color:colors) {
			System.out.print(color+" ");
		}
		
		System.out.println();
		
		int[] numbers= {10, 20, 30, 40};
		
		for(int num:numbers) {
			System.out.print(num+" ");
		}	
	}

}
