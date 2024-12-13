/*
	Author:Indra Phukan
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        
        String a = sponge(sentence);
        System.out.println(a);

	}
	
	public static String sponge(String userWord){
		String g = userWord;
		String x = "";
		for (int i = 0; i < g.length(); i++){
			String letter = g.substring(i, i+1);
			if (g.indexOf(letter) % 2 == 0){
				letter = letter.toUpperCase();
			}
			else {
				letter = letter.toLowerCase();
			}
			x+=letter;
			
		}
		return x;
	}
	
}
