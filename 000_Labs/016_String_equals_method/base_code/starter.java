/*
 *	Author:  Indra Phukan
 *  Date: 9/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String answer = sc.nextLine();
	
		
		if (answer.equals("Wizard")){
			System.out.print("You have chosen to be a Wizard!");
		}
		
		else if (answer.equals("Warrior")){
			System.out.print("You have chosen to be a Warrior!");
		}
		else if (answer.equals("Rogue")){
			System.out.print("You have chosen to go rogue!");
		}
	
	
	}
}
