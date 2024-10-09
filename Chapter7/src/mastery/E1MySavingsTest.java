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
		
		int selection;
		
	
		
		
		
		while (true) { //loop incase user inputs something other then whats listed
			try {
			
				System.out.println("Please input the number of your option.");
				System.out.println("1. Show total in bank.");
				System.out.println("2. Add pennies.");
				System.out.println("3. Add nickels.");
				System.out.println("4. Add dimes.");
				System.out.println("5. Add quarters.");
				System.out.println("6. Take money out of bank.");
				System.out.println("Enter 0 to quit.");
				String strselection = scanner.nextLine(); //accepts input
				
				try {//in case a error happens the code doesnt just end
					selection = Integer.parseInt(strselection); //changes the input form user to int from string
				} catch (Exception e) { //to not break code
					System.out.println("Something went wrong. Please try again.");//tells user to try again
					System.out.println("");//creates white space
					continue;//restarts loop
				}
					
				//outputs different stuff based on what user inputs for their selection
				if (selection == 1) {
					spot.displayTotalMoney();//gets total money from other file and prints it
					System.out.println("");//creates white space
					
				}else if (selection == 2) { 
					System.out.println("How many pennies would you like to deposit?");
					strselection = scanner.nextLine();//accepts user input
					spot.addPennies(strselection);//runs the add pennies method 
					
				}else if (selection == 3) {
					System.out.println("How many nickels would you like to deposit?");
					strselection = scanner.nextLine();//accepts user input
					spot.addNickels(strselection);//runs the add nickels method 
					
				}else if (selection == 4) {
					System.out.println("How many dimes would you like to deposit?");
					strselection = scanner.nextLine();//accepts user input
					spot.addDimes(strselection);//runs the add dimes method 
					
				}else if (selection == 5) {
					System.out.println("How many quarters would you like to deposit?");
					strselection = scanner.nextLine();//accepts user input
					spot.addQuarters(strselection);//runs the add quarters method 
					
				}else if (selection == 6) { 
					spot.withdrawMoney(strselection);//removes money from the account
					
				}else if (selection ==  0) {
					System.out.println("Bye bye!");
					break; //ends the application
					
				}
				
				else { //restarts loop incase anything unexpected happens
					System.out.println("Something went wrong. Please try again."); 
					System.out.println("");//whitespace
					continue;//restarts loop
				}
			
			} catch (Exception e) { //final loop block for if any errors pop up
				System.out.println("Something went wrong. Please try again."); 
				System.out.println("");//whitespace
				continue;//restarts loop
			}
		}
		
		
		
		
		
		
		
		
	}
}
