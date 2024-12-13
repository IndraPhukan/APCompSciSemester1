/*
 *	Author:  Indra Phukan
 *  Date: 10/18/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		myCharacter empty = new myCharacter();
		System.out.println("Your role is " + empty.getRole());
		System.out.println("Your strength trait is " + empty.getStrength());
		System.out.println("Your dexterity trait is " + empty.getDexterity());
		System.out.println("Your intelligence trait is " + empty.getIntelligence());
		System.out.println("Your charisma trait is " + empty.getCharisma());
		
		System.out.println("What class would you like to be?");
		String userrole = sc.nextLine();
		
		myCharacter userInput = new myCharacter(userrole);
		System.out.println("Your role is " + userInput.getRole());
		System.out.println("Your strength trait is " + userInput.getStrength());
		System.out.println("Your dexterity trait is " + userInput.getDexterity());
		System.out.println("Your intelligence trait is " + userInput.getIntelligence());
		System.out.println("Your charisma trait is " + userInput.getCharisma());
		



		
	}
}
