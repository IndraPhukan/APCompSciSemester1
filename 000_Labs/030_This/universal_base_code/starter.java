/*
 *	Author:  Indra
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf one = new PooleDwarf(randName(), ((int) Math.random() * 100));
		PooleDwarf two = new PooleDwarf(randName(), ((int) Math.random() * 100));
		PooleDwarf three = new PooleDwarf(randName(), ((int) Math.random() * 100));
		PooleDwarf four = new PooleDwarf(randName(), ((int) Math.random() * 100));
		PooleDwarf five = new PooleDwarf(randName(), ((int) Math.random() * 100));
		PooleDwarf six = new PooleDwarf(randName(), ((int) Math.random() * 100));
		PooleDwarf seven = new PooleDwarf(randName(), ((int) Math.random() * 100));
		
		int numName = 0;
		
		if (one.getName().equals(two.getName())){
			
			numName+=1;
			
			
		}
		else if (one.getName().equals(three.getName())){
			
			numName+=1;
		}
		
		else if (one.getName().equals(four.getName())){
			
			numName+=1;
		}
		else if (one.getName().equals(five.getName())){
			numName+=1;
		}
		else if (one.getName().equals(six.getName())){
			numName+=1;
		}
		else if (one.getName().equals(seven.getName())){
			numName+=1;
		}
		
		System.out.print(one.getName() + " was the name with " + numName + " matches!");
		
	
		
	}
}
