/*
 *	Author:  indra phukan
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int arraysize = (int)((Math.random() * 150) + 51);
		int [] arr = new int [arraysize];
		
		for (int i = 0; i < arraysize; i++){
			arr[i] = (int)((Math.random() * 100) + 1);
		
		}
		
		int min = 100;
		for (int i = 0; i < arraysize; i++){
			
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < arraysize; i++){
			
			if (arr[i] > max){
				max = arr[i];
			}
		}
		
		int total = 0;
		
		for (int i = 0; i < arr.length; i++){
			total+=arr[i];
		}
		
		int average = total/arr.length;
		
		System.out.println("There are " + arraysize + " elements");
		
		System.out.println("The minimum is " + min);
		System.out.println("The maximum is " + max);
		System.out.println("The average is " + average);
		
		

		
	}
}
