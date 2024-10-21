package mastery;



/*
Program: E1EvensAndOdds.java          Last Date of this Revision: October 21, 2024

Purpose: Create a EvensAndOdds application that generates 25 random integers between 0 and 99 and then displays all the evens on one line and all the odds on the next line. 

Author: bilal 
School: CHHS
Course: Computer Programming 20
*/


import java.util.ArrayList;
import java.util.Random;

public class E1EvenAndOdds {
	public static void main(String[] args) {
		// Create a Random object to generate random integers
		Random random = new Random();
		
		
		// Create lists to hold even and odd numbers
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		
		// Generate 25 random integers between 0 and 99
		for (int i = 0; i < 25; i++) {
		    int num = random.nextInt(100); // Generates a random number between 0 and 99
		    if (num % 2 == 0) { //tests if number is even or odd
		        evens.add(num); // Add to evens if the number is even
		    } else {
		        odds.add(num); // Add to odds if the number is odd
		    }
		}
		
		// Display all odd numbers
		System.out.print("ODD: ");
		for (int odd : odds) {
		    System.out.print(odd + " ");
		}
		System.out.println(); // Move to the next line
		
		// Display all even numbers
		System.out.print("EVEN: ");
		for (int even : evens) {
		    System.out.print(even + " ");
		 }
	}
}

/*
 
test case 1

ODD: 9 43 3 75 45 59 85 51 97 19 25 73 25 65 
EVEN: 48 14 66 68 84 0 76 82 70 50 12 


test case 2

ODD: 69 65 27 89 61 75 93 25 11 33 83 29 79 
EVEN: 86 10 68 32 96 74 70 18 84 52 48 26 
 

test case 3

ODD: 91 33 45 47 43 75 65 47 23 99 
EVEN: 82 12 62 92 6 80 22 92 32 88 40 58 14 46 2 


 */

