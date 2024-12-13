/*
 *	Author:  indra phukan
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior [] war = new Warrior[100];
		for (int i = 0; i < war.length; i++){
			war[i] = new Warrior();
		}
		
		Wizard [] wiz = new Wizard[100];
		for (int i = 0; i < wiz.length; i++){
			wiz[i] = new Wizard();
		}
		
		int wizAlive = wiz.length;
		for (int i = 0; i < wizAlive; i++){
			if (wiz.isDead(wiz)){
				wizAlive = wizAlive - 1;
			}
			else{
				wiz.attack(war);
			}
		}
		

	}
}
