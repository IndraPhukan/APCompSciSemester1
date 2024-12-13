/*
 *	Author:  Indra Phukan
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	 
    String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;
    

    public myCharacter(){
        role = "No role";
        strength = 0;
        dexterity = 0;
        intelligence = 0;
        charisma = 0;
  
    }
    
    public myCharacter(String x){
   
    	strength = 0;
        dexterity = 0;
        intelligence = 0;
        charisma = 0;
        setRole(x);
    }
    
    public String setRole(String userRole){
        role = userRole;
        if (role.equals("Wizard")){
            System.out.println("You've chosen the Wizard! Excelsior!");
            
        }
        if (role.equals("Warrior")){
            System.out.println("You've chosen the Warrior! For honor!");
            
        }
        if (role.equals("Rogue")){
            System.out.println("You chose Rogue! How Cunning!");
            
        }
        if (!userRole.equals("Wizard") && !userRole.equals("Warrior") && !userRole.equals("Rogue")){
    		System.out.println("You've decided not to chose a role. Rerun program.");
    		role = "No role";
    	}
    	
    	return role;
    }
    
    public int setStrength(int userStrength){
        
        strength = userStrength;
        
        if (strength < 0){
            
            strength = 0;
        }
        
        return strength;
    }
    
    public int setDexterity(int userDexterity){
        dexterity = userDexterity;
        return dexterity;
        
    }
    
    public int setIntelligence(int userIntelligence){
        intelligence = userIntelligence;
        return intelligence;
        
    }
    
    public int setCharisma(int userCharisma){
        charisma = userCharisma;
        return charisma;
    }
        
    public boolean setAll(String userRole, int userStrength, int userDexterity, int userIntelligence, int userCharisma){
        setRole(userRole);
        setStrength(userStrength);
        setDexterity(userDexterity);
        setIntelligence(userIntelligence);
        setCharisma(userCharisma);
        return true;
        
    }
    
    public String getRole(){
        return role;
    }
    
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getIntelligence(){
        return intelligence;
    }
        
    public int getCharisma(){
        return charisma;
    }
    public void myToString(){
        System.out.println("Your role is " + getRole());
		System.out.println("Your strength trait is " + getStrength());
		System.out.println("Your dexterity trait is " + getDexterity());
		System.out.println("Your intelligence trait is " + getIntelligence());
		System.out.println("Your charisma trait is " + getCharisma());
        return;
    }
    

}

