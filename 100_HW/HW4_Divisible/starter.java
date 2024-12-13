/*
 *	Author: Indra
 *  Date: 9/29
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int integer1 = sc.nextInt();
		
		
		System.out.print("Please enter another integer: ");
		int integer2 = sc.nextInt();
		
		if (integer1 % 2 == 0){
			System.out.println(integer1 + " is divisible by 2, it is an even number!");
		}
		else{
			System.out.println(integer1 + " is not divisible by 2, it is an odd number!");
		}
		
		if (integer1 % 3 == 0){
			System.out.println(integer1 + " is divisible by 3!");
		}
		
		if (integer1 % 4 == 0){
			System.out.println(integer1 + " is divisible by 4!");
		}
		
		if (integer1 % 5 == 0){
			System.out.println(integer1 + " is divisible by 5!");
		}
		
		if ((integer1 % 3 != 0) && (integer1 % 4 != 0) && (integer1 % 5 != 0)){
			System.out.println(integer1 + " is not divisible by 3, 4, or 5!");
			
		}
		
		if (integer2 % 2 == 0){
			System.out.println(integer2 + " is divisible by 2, it is an even number!");
		}
		else{
			System.out.println(integer2 + " is not divisible by 2, it is an odd number!");
		}
		
		if (integer2 % 3 == 0){
			System.out.println(integer2 + " is divisible by 3!");
		}
		
		if (integer2 % 4 == 0){
			System.out.println(integer2 + " is divisible by 4!");
		}
		
		if (integer2 % 5 == 0){
			System.out.println(integer2 + " is divisible by 5!");
		}
		
		if ((integer2 % 3 != 0) && (integer2 % 4 != 0) && (integer2 % 5 != 0)){
			System.out.println(integer2 + " is not divisible by 3, 4, or 5!");
			
		}
	
	}
}
