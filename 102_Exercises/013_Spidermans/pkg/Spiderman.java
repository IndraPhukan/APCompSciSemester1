package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villan;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	public Spiderman(){
		actor = "Unknown";
		age = 0;
		villan = "Unknown";
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	public Spiderman(String a){
		actor = a;
		age = 0;
		villan = "Unknown";
	}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	public Spiderman(int a){
		actor = "Unknown";
		age = a;
		villan = "Unknown";
	}

	// String Actor, int Age constructor! 	Villain Unknown
	public Spiderman(String act, int a){
		actor = act;
		age = a;
		villan = "Unknown";
	}
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(String act, int a, String vil){
		actor = act;
		age = a;
		villan = vil;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setAge(int age){
		this.age = age;
	}
	public void setVillan(String villan){
		this.villan = villan;
	}
	public void setActor(String actor){
		this.actor = actor;
	}
	
	public String getActor(){
		return actor;
	}
	public String getVillan(){
		return villan;
	}
	public int getAge(){
		return age;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villan);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
