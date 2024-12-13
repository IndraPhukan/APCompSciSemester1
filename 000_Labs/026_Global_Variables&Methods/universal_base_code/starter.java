/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		myCharacter empty = new myCharacter();
		empty.myToString();
		
		System.out.println("What class would you like to be?");
		String userrole = sc.nextLine();
		
		myCharacter userInput = new myCharacter(userrole);
		userInput.myToString();
		


		
	}
}
