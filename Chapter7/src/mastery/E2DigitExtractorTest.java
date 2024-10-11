package mastery;

import java.util.Scanner;

/*
Program: E2DigitExtractorTest.java          Last Date of this Revision: October 11, 2024

Purpose: Create a digit extractor application that prompts the user for an integer then displays the ones, tens, and hundreds digit of the number.


Author: bilal 
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;
public class E2DigitExtractorTest {
	public static void main(String[] args){
		//creating scanner for user input
		Scanner scanner = new Scanner(System.in);
	
		//creates object so we can use methods and such from the other file
		E2DigitExtractor num = new E2DigitExtractor();
				
		//defining variables
		int selection;
		String haw = "w";
		
	
		while (true) { //loop incase user inputs something other then whats listed
			try {
			
				System.out.println("Enter an integer.");
				selection = Integer.parseInt(scanner.nextLine()); //accepts input
				
				System.out.println("Show (W)hole number.");
				System.out.println("Show (O)nes place number.");
				System.out.println("Show (T)ens place number.");
				System.out.println("Show (H)undreds place number.");
				System.out.println("(Q)uit");
				System.out.println("Enter your choice.");
				String strselection =  scanner.nextLine().toLowerCase(); //accepts input
				
				
				try {//in case a error happens the code doesnt just end
					
					
				} catch (Exception e) { //to not break code
					System.out.println("Something went wrong. Please try again.");//tells user to try again
					System.out.println("");//creates white space
					continue;//restarts loop
				}
		
		
				if (strselection == haw) {
					System.out.println("w");//creates white space
					
				}else if (strselection == "o") { 
					
				}else if (strselection == "t") { 
					
				}else if (strselection == "h") { 
					
				}else if (strselection == "q") { 
					
				}else {
					System.out.println("bah");
				}
				
				
				
			} catch(Exception e) {
				
			}
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
