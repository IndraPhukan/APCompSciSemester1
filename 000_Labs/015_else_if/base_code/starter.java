/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please pick a number between 1 - 1000:");
		int answer = sc.nextInt();
		
		int x = (int)(Math.random()*999) + 1;
		
		if (x == answer){
			System.out.print("Your number was the random number");
		}
		
		else if (answer > x){
			System.out.print("Your number was larger than the number. The number was " + x + ".");
		}
		else if (answer < x){
			System.out.print("Your number was smaller than the number. The number was " + x + ".");
		}
	
	
	}
}
