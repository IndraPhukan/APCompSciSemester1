/*
 *	Author:Indra Phukan
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int [] arr = new int [20];
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random() * 10) + 1);
			
		}
		
		System.out.println("These are the random numbers: ");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
			
		}
		
		int rand = (int)((Math.random() * 10) + 1);
		System.out.println("\nThe random number to look for is " + rand);
		
		int total = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == rand){
				System.out.println("Duplicate found at index " + (i + 1));
				total ++;
			}
		}
		System.out.println("Total number of duplicates for " + rand + " is " + total);
		
		System.out.println("Looking for two in a row: ");
		for(int i = 0; i < arr.length; i++){
			if (arr[i] == arr[(i+1)]){
				System.out.println("Two in a row found at indexes " + (i + 1) + " and " + (i + 2) + ". The number is " + arr[i]);
				
			}
		}
		
		

	}
}
