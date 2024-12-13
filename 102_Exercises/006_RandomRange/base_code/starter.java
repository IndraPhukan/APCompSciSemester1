/*
 *	Author: Indra Phukan
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		
		System.out.print("Please enter an integer:");
		int number1 = sc.nextInt();
		
		System.out.print("Please enter another integer(bigger than the first):");
		int number2 = sc.nextInt();
		
		System.out.println("Your range is " + number1 + " to " + number2 + ".");
		
		int num1 = (int)(Math.random() * (number2 - number1)) + number1;
		int num2 = (int)(Math.random() * (number2 - number1)) + number1;
		int num3 = (int)(Math.random() * (number2 - number1)) + number1;
		int num4 = (int)(Math.random() * (number2 - number1)) + number1;
		int num5 = (int)(Math.random() * (number2 - number1)) + number1;
		
		System.out.println("Here are five numbers generated in that range.");
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
		
	}
}
		
		
