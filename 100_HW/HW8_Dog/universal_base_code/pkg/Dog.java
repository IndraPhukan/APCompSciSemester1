package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
	String name;
	int age;
	String breed;
	
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
		
	}
	public Dog(String nm){
		name = nm;
		age = 1;
		breed = "Dog Dog";
	}
	public Dog(String nm, String brd){
		name = nm;
		breed = brd;
		age = 1;
	}
	public Dog(String nm, int ag){
		name = nm;
		breed = "Dog Dog";
		age = ag;
	}
	
	
	public void setName(String nm){
		name = nm;
		return;
	}
	public void setAge(int ag){
		age = ag;
		return;
	}
	public void setBreed(String brd){
		breed = brd;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		double x = Math.random();
		
		if (x > 0.5){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " barks!");
	}

}
