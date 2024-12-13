/*
 *	Author:  Indra Phukan
 *  Date: 10/11
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int x, int y){
		
		int count = 0;
		int product = 1;
		
		while (true){
			if (count >= y){
				break;
			}
			
			product = product * x;
			count = count + 1;
		}
		
		return product;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		
		System.out.println("What is your exponent?");
		int exponent = sc.nextInt();
		
		int z = pow(base, exponent);
		
		System.out.print("Your answer is " + z + ".");
	

		
	}
}
