package mastery;

/*

Program: E21GroupAssignment.java          Last Date of this Revision: September 23, 2024

Purpose: create a groupassignment application that prompts the user for his or her name and then displays a group assignment
Author: bilal 
School: CHHS
Course: Computer Programming 20

*/

//importing function
import java.util.Scanner;

public class E21GroupAssignment {
	public static void main(String args[]) {
		
		//defining scanner class
		Scanner scanner = new Scanner(System.in);
		
		//asking user for first name
		System.out.println("What is your first name?");
		String firstname = scanner.nextLine();
		
		//asking user for last name 
		System.out.println("What is your last name?");
		String lastname = scanner.nextLine();
		
		//gets first letter of last name and capitilizes it
		char firstletter = lastname.toUpperCase().charAt(0);
		int group = 0;
		
		//determine group number based on first letter
		if (firstletter >= 'A' && firstletter <= 'I') { //for group 1
			group = 1;
		} else if (firstletter >= 'J' && firstletter <= 'S') { // for group 2
			group = 2;
		} else if (firstletter >= 'T' && firstletter <= 'Z') { // for group 3
			group = 3;
		}
		
		//displays the group

		System.out.println(firstname + " " + lastname + " is assigned to group "+ group + ".");
	}
}

/* Screen Dump

Paste the output of your code here



What is your first name?
amanda 
What is your last name?
holt
amanda holt is assigned to group 1.

What is your first name?
maria 
What is your last name?
carrey
maria carrey is assigned to group 1.

What is your first name?
mohammad
What is your last name?
zayan
mohammad zayan is assigned to group 3.

What is your first name?
micheal
What is your last name?
jordan
micheal jordan is assigned to group 2.


*/