/*
 *	Author:Indra phukan
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Shrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Shrute", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Employee indra = new Employee(1234, "Indra", "Phukan", 5000.67);
		
		dwight.raiseSalary(10);
		jim.raiseSalary(15);
		pam.raiseSalary(30);
		indra.raiseSalary(12);
		
		dwight.employeeToString();
		System.out.println("Dwight's annual salary is " + dwight.getAnnualSalary());
		
		jim.employeeToString();
		System.out.println("Jim's annual salary is " + jim.getAnnualSalary());
		
		pam.employeeToString();
		System.out.println("Pam's annual salary is " + pam.getAnnualSalary());
		
		indra.employeeToString();
		System.out.println("Indra's annual salary is " + dwight.getAnnualSalary());
		
		
	}
}
