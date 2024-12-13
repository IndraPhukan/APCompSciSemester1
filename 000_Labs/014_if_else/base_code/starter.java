/*
 *	Author:  Indra Phukan
 *  Date: 9/23
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please pick a number between 1 - 1000:");
		int answer = sc.nextInt();
		
		int x = (int)(Math.random()*1000);
		
		if (x == answer){
			System.out.print("Your number was the random number");
		}
		
		else if (x != answer){
			System.out.print("Your number wasn't the random number. The number was " + x + ".");
		}
		
		 
	}
}
