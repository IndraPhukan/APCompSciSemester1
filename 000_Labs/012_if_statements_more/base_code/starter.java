/*
 *	Author:  Indra Phukan
 *  Date: 9/18/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please write an integer");
		int answer1 = sc.nextInt();
		
		System.out.println("Please write another integer");
		int answer2 = sc.nextInt();
		
		if (answer1 == answer2){
			System.out.print("These two values are equal");
			
		}
		else{
			System.out.print("These two values are not equal");
		}
	
	}
}
