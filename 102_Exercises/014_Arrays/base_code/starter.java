/*
 *	Author:Indra
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[1001];
		int i  = 0;
		
		while (i < 1000){
			arr1[i] = (i + 1) * 3;
			System.out.println(arr1[i]);
			i = i + 1;
		
			
		}
		
		int [] arr2 = new int[1001];
		int a = 0;
		
		while (a < 1000){
			arr2[a] = 1000 - a;
			System.out.println(arr2[a]);
			a = a + 1;
		
			
		}
		 
	}
}
