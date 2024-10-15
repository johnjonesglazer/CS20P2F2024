package mastery;

import java.util.Scanner;

/*
Program: E2DigitExtractorTest.java          Last Date of this Revision: October 11, 2024

Purpose: Create a digit extractor application that prompts the user for an integer then displays the ones, tens, and hundreds digit of the number.


Author: bilal 
School: CHHS
Course: Computer Programming 20
*/

public class E2DigitExtractorTest {
	public static void main(String[] args){
		//creating scanner for user input
		Scanner scanner = new Scanner(System.in);
	
		//creates object so we can use methods and such from the other file
		E2DigitExtractor num = new E2DigitExtractor();
				
		//defining variables
		int selection;
		
		
	
		while (true) { //loop incase user inputs something other then whats listed
			try {
				System.out.println("Enter an integer.");
				selection = Integer.parseInt(scanner.nextLine()); //accepts input
				break;
				
			}catch (Exception e) { //to not break code
				System.out.println("Something went wrong. Please try again.");//tells user to try again
				System.out.println("");//creates white space
				continue;//restarts loop
			}
			
				
			
		}
			
			
			
		while (true) {	
			try {
				
				System.out.println("Show (W)hole number.");//instructions
				System.out.println("Show (O)nes place number.");
				System.out.println("Show (T)ens place number.");
				System.out.println("Show (H)undreds place number.");
				System.out.println("(Q)uit");
				System.out.println("Enter your choice.");
				String strselection =  scanner.nextLine(); //accepts input
				
		
		
				if (strselection.equalsIgnoreCase("w")) {
					num.showWhole(selection);//runs method from other file to show the number
					System.out.println("");//creates white space
					
				}else if (strselection.equalsIgnoreCase("o")) { 
					num.showOnesplace(selection);//runs method from other file to show the ones place
					System.out.println("");//creates white space
					
					
				}else if (strselection.equalsIgnoreCase("t")) { 
					num.showTensplace(selection);//runs method from other file to show the ones place
					System.out.println("");//creates white space
					
				}else if (strselection.equalsIgnoreCase("h")) { 
					num.showHundredsplace(selection);//runs method from other file to show the ones place
					System.out.println("");//creates white space
					
				}else if (strselection.equalsIgnoreCase("q")) { 
					System.out.println("Have a good day.");
					break;
				}else {
					System.out.println("Error. Please select a listed option.");//tells user they made a mistake and to redo input
					System.out.println("");//white space
				}
				
				
			} catch(Exception e) {
				System.out.println("Something went wrong. Please try again.");//tells user to try again
				System.out.println("");//creates white space
				continue;//restarts loop
			}
			
		}
	
	}
	
}



/*



test case 1

Enter an integer.
123
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
w
The whole number is 123.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
o
The ones place number is 3.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
n
Error. Please select a listed option.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
t
The tens place number is 2.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
h
The hundreds place number is 1.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
q
Have a good day.




test case 2 

Enter an integer.
523
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
w
The whole number is 523.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
o
The ones place number is 3.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
t
The tens place number is 2.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
q
Have a good day.




test case 3 


Enter an integer.
724
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
h
The hundreds place number is 7.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
t
The tens place number is 2.

Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice.
q
Have a good day.




*/

