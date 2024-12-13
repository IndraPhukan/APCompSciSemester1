/*
 *	Author:  Indra Phukan
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        String backward = "";
        int space = 0;
        String word = "";
        
        while (true){
    		space = sentence.indexOf(" ");
    		if (space == -1){
    			word = sentence;
    			backward = word + " " + backward;
        		System.out.println(backward);
        		break;
        	}
    		word = sentence.substring(0, space);
    		sentence = sentence.substring(space+1);
    		backward = word + " " + backward;
    	
        }
        
        
		


		
	}
}
