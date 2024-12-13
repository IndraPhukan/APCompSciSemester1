/*
 *	Author:  Indra Phukan
 *  Date: 10/10
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String string){
		System.out.println(string);
		return;
	}
	
	public static void toStringCombined(String one, String two){
		System.out.println(one + " " + two);
		return;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please write a sentence: ");
		String sentence = sc.nextLine();
		
		System.out.println("Please write a sentence: ");
		String sentence2 = sc.nextLine();
		
		System.out.println("This is using methods!");
		
		toString(sentence);
		toStringCombined(sentence, sentence2);
		

		
	}
}
