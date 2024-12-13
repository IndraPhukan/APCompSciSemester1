/*
 *	Author: Indra Phukan
 *  Date: 9/18/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input what day it is");
		System.out.println("0 = Sunday");
		System.out.println("1 = Monday");
		System.out.println("2 = Tuesday");
		System.out.println("3 = Wendsday");
		System.out.println("4 = Thursday");
		System.out.println("5 = Friday");
		System.out.println("6 = Saturday");
		
		int day = sc.nextInt();
		
		if((day == 0) || (day == 6)){
			System.out.print("It is 10.00am, please wake up!");
		}
		
		else if((day > 1) && (day < 6)){
			System.out.print("It is 7.00am, please wake up!");
			
		}
		
		else{
			System.out.println("Please input the correct number");
		}
		
		
		
	}
}
