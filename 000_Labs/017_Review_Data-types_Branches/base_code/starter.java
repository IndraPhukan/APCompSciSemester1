/*
 *	Author:  Indra Phukan
 *  Date: 9/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your title? Ex: Slayer of Dragons?");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
	
		
		if (role.equals("Wizard")){
			System.out.println("You have chosen to be a Wizard!");
		}
		
		else if (role.equals("Warrior")){
			System.out.println("You have chosen to be a Warrior!");
		}
		else if (role.equals("Rogue")){
			System.out.println("You have chosen to go Rogue!");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma.");
		System.out.println("Spend them wisely");
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		int leftover1 = (20 - strength);
		
		if ((strength <= 10) && (strength >= 0)){
			System.out.println("You have " + leftover1 + " points left to spend.");
		}
		else{
			System.out.println("Please input the correct number.");
			System.out.println("Strength (1-10): ");
			strength = sc.nextInt();
		}
		
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		int leftover2 = (leftover1 - dexterity);
		
		if ((dexterity <= 10) && (dexterity >= 0)){
			System.out.println("You have " + leftover2 + " points left to spend.");
			
		}
		else{
			System.out.println("Please input the correct number.");
			System.out.println("Dexterity (1-10): ");
			dexterity = sc.nextInt();
		}
		
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		int leftover3 = (leftover2 - intelligence);
		
		if (intelligence > leftover2){
			System.out.println("You only have " + leftover2 + " points left to spend.");
			System.out.print("Intelligence (1-10): ");
			intelligence = sc.nextInt();
		}
		
		else if ((intelligence <= 10) && (intelligence >= 0)){
			System.out.println("You have " + leftover3 + " points left to spend.");
			
		}
		else{
			System.out.print("Please input the correct number.");
			System.out.print("Intelligence (1-10): ");
			intelligence = sc.nextInt();
		}
		
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		
		
		if (charisma > leftover3){
			System.out.println("You only have " + leftover3 + " points left to spend.");
			System.out.print("Charisma (1-10): ");
			charisma = sc.nextInt();
		}
		
		else if ((intelligence <= 10) && (intelligence >= 0)){
			
			
		}
		else{
			System.out.print("Please input the correct number.");
			System.out.print("Charisma (1-10): ");
			charisma = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("You are " + name + ", the " + title + " of CVHS");
		System.out.println("You're a " + role + " with the following stats.");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		
		
		
		
		
		
		
	}
}
		
		
