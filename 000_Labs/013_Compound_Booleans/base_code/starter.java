/*
 *	Author:  Indra
 *  Date: 9/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your first number: ");
		int first = sc.nextInt();
		
		System.out.print("Please enter your second number: ");
		int second = sc.nextInt();
		
		System.out.print("Please enter your third number: ");
		int third = sc.nextInt();
			
		if ((first > second) && (first > third)){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("That number is " + first);
			
		}
		if ((second > first) && (second > third)){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("That number is " + second);
			
		}
		if ((third > second) && (third > first)){
			System.out.println("Your third number is the largest of the three!");
			System.out.println("That number is " + third);
		
		}
		
		
			
		if ((first < second) && (first < third)){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("That number is " + first);
			
		}
		if ((second < first) && (second < third)){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("That number is " + second);
			
		}
		if ((third < second) && (third < first)){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("That number is " + third);
		}
	
			
		
		
	}
}
