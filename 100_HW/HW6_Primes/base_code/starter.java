/*
 *	Author:Indra Phukan
 *  Date: 10/12
*/

import java.util.Scanner;

class starter {
	
	public static boolean checkPrime(int a){
		
		int count = 2;
		int og = a;
		int divisor = a;
		boolean x = true;
		
		while (count < a){
			
			divisor = divisor - 1;
			x = og % divisor != 0;
			if (x == false){
				break;
			}
			
			count = count + 1;
		}
		
		return x;
		
	}
	
	public static void printPrimes(int c){
		
		int usernum = c;
		int count = 2;
		
		while(count <= c){
			
			boolean k = checkPrime(usernum);
			
			if (k == true){
				System.out.println(usernum);
			}
			
			
			usernum = usernum - 1;
			count = count + 1;
		}
		
		return;
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a number and we'll print out every prime until that number:");
		
		int b = sc.nextInt();
		
		printPrimes(b);
		
		
	}
	
}
