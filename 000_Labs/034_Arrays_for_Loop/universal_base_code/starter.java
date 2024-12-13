/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] x = new int [1000];
		
		
		for (int i = 0; i < 1000; i++){
			x[i] = (int)(Math.random() * 1000);
			System.out.println(i + ":" + x[i]);
		}
			
		

		
	}
}
