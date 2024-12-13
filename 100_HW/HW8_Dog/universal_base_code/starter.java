/*
 *	Author:Indra pHukan
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Dog dog1 = new Dog("Pinto");
		dog1.setAge(7);
		
		Dog dog2 = new Dog("Pinto2", 9);
		
		
		if (dog1.isSleeping()){
			System.out.println(dog1.getName() + " is asleep.");
			
		}
		else{
			dog1.bark();
			dog2.bark();
		}
		
		
		
		
		



	}
}
