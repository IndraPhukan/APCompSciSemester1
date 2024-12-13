package pkg;
import java.util.Scanner;

public class character{
    
    String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;
    
    public character(){
        role = "wizard";
        strength = 5;
        dexterity = 5;
        intelligence = 5;
        charisma = 5;
  
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
    
    
    
}