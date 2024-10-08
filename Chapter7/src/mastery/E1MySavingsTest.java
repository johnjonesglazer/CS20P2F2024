package mastery;

/*
Program: E1MySavingsTest.java          Last Date of this Revision: October 8, 2024

Purpose: Create a Mysavings application that displays a menu of choices for entering pennies nickels dimes and quarters in to a piggy bank then prompts user to make a selection.

Author: bilal 
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;


public class E1MySavingsTest {
	public static void main(String[] args){
		//creating scanner for user input
		Scanner scanner = new Scanner(System.in);
		
		//sets spot so we can use methods and such from the other file
		E1MySavings spot = new E1MySavings();
		
		//defining variables
		//int userSelection = 0;
		
		
		//System.out.println("Please input the number of your option."); 
		String selection;
		
		
		
		while (true) { //loop incase user inputs something other then whats listed
			System.out.println("Please input the number of your option.");
			System.out.println("1. Show total in bank.");
			System.out.println("2. Add pennies.");
			System.out.println("3. Add nickels.");
			System.out.println("4. Add dimes.");
			System.out.println("5. Add quarters.");
			System.out.println("6. Take money out of bank.");
			System.out.println("Enter 0 to quit.");
			selection = scanner.nextLine(); //accepts input
			
			System.out.println("Please input the number of your option.");
			selection = scanner.nextLine(); //accepts input
			
			//if the user inputs anything other then the listed options it will loop and restart the asking process
			if (selection == "1" || selection == "2" || selection == "3" || selection == "4" || selection == "5" || selection == "6" ||selection ==  "0") {
				int userSelection = Integer.parseInt(selection); //converts input to int from string and saves it 
				break; //ends loop
			} 
			
			else { //if user inputs anything other then listed options it will restart loop
				System.out.println("Error. Please select a listed option."); //says error
				continue;//restarts loop
			}
		
		}
		
		
		
		
		
		
		
		
	}
}
