/*
 *	Author:  indra
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] x = new int [1000];
		int i = 0;
		
		while (i < 1000){
			x[i] = (int)(Math.random() * 1000);
			System.out.println(x[i]);
			i++;
		}
		


		
	}
}
