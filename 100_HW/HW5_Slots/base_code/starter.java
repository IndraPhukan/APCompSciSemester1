/*
 *	Author: Indra Phukan
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int money = 100;
		int wager = 0;
		
		while (money > 0 ){
			System.out.print("Would you like to play the slots (Yes/No): ");
			String answer = sc.nextLine();
			
			if ((answer.equals("Yes")) || (answer.equals("Y")) || (answer.equals("y")) || (answer.equals("yes"))){
				System.out.print("You have $" + money + ". How much would you like to wager?: ");
				wager = sc.nextInt();
				
				System.out.println("Your rolls are...");
				
				int num1 = (int)((Math.random() * 10) + 1);
				int num2 = (int)((Math.random() * 10) + 1);
				int num3 = (int)((Math.random() * 10) + 1);
				System.out.println(num1 + " | " + num2 + " | " + num3);
				
				if ((num1 != num2) && (num1 != num3) && (num2 != num3)){
					
					money = money - wager;
					
					System.out.println("Sorry you did not win this time, try again next time!");
					System.out.println("You now have $" + money + ".");
				}
				else if ((num1 == num2) || (num1 == num3) || (num2 == num3)){
					
					money = money + wager;
					System.out.println("You won! Your wager has now been doubled.");
					System.out.println("You have $" + money);
					
					
				}
				else if ((num1 == num2) && (num2 == num3) && (num3 == num1)){
					
					money = money + (wager * 2);
					System.out.println("You won! Your wager has now been tripled.");
					System.out.println("You have $" + money);
					
				}
				
				
			}
			else if ((answer.equals("No")) || (answer.equals("no")) || (answer.equals("N")) || (answer.equals("n"))){
				System.out.println("See you next time! You have " + money + " dollars left.");
				break;
			}
			else if (!((answer.equals("Yes")) && (answer.equals("Y")) && (answer.equals("y")) && (answer.equals("yes")) && (answer.equals("No")) && (answer.equals("no")) && (answer.equals("N")) && (answer.equals("n")))){
				System.out.println("I don't understand. Please try again.");
				
			}
		
		}
		
		System.out.println("You have run out of money. Come back soon!");
		
		
		
	}
}
