/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman test = new Spiderman("Bob");
		test.setAge(32);
		test.setVillan("Joe");
		
		Spiderman two = new Spiderman("Toby Maguire", 49, "Green Goblin");
		
		Spiderman three = new Spiderman("Andrew Garfield", 41);
		three.setVillan("Electro");
		System.out.print("The villan is " + three.getVillan());
		// Your code goes below here

		
	}
}
