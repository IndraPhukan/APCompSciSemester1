/*
   * Author:Indra Phukan
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        String pigLatin = "";
        int space = 0;
        String word = "";
        String one = "";
        String two = "";
        
        while (true){
        	space = sentence.indexOf(" ");
        	if (space == -1){
        	    word = sentence;
        	    one = word.substring(0,1);
        	    two = word.substring(1,2);
        	    
                if (one.equals("a") || one.equals("i") || one.equals("o") || one.equals("u")||one.equals("e")){
        		    System.out.print(word + "-way" + " ");
     
        		
        	    }
        	    else if(two.equals("a") || two.equals("i") || two.equals("o") || two.equals("u")||two.equals("e")){
        		    String z = word.substring(1) + "-" + one + "ay" + " ";
        		    System.out.print(z);
        		
        	    }
        	    else{
        		    String e = word.substring(2) + "-" + one + two + "ay" + " ";
        		    System.out.print(e);
        		
        		
        	    }
        	    break;
            }
        	word = sentence.substring(0, space);
        	sentence = sentence.substring(space+1);
        	
        	one = word.substring(0,1);
        	two = word.substring(1,2);
        	
        	if (one.equals("a") || one.equals("i") || one.equals("o") || one.equals("u")||one.equals("e")){
        		System.out.print(word + "-way" + " ");
     
        		
        	}
        	else if(two.equals("a") || two.equals("i") || two.equals("o") || two.equals("u")||two.equals("e")){
        		String z = word.substring(1) + "-" + one + "ay" + " ";
        		System.out.print(z);
        		
        	}
        	else{
        		String e = word.substring(2) + "-" + one + two + "ay" + " ";
        		System.out.print(e);
        		
        		
        	}
        	
        	
        	
        }
		
		
	}
}
