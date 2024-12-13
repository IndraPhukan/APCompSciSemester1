/*
 *	Author:  Indra Phukan
 *  Date: 10/2
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please guess a number: ");
		int guess = sc.nextInt();
		
		int secret = (int)(Math.random() * 1000);
		
		while (guess != secret){
			if(guess > secret){
				System.out.println("You're a little too high!");
			}
			if(guess < secret){
				System.out.println("You're a little too low!");
			}
			System.out.print("Please guess a number: ");
			guess = sc.nextInt();	
			
		}
		System.out.println("You guessed it!");
		
		



		
	}
}
