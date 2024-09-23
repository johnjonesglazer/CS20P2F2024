package mastery;

/*

Program: E1Primenumbers.java          Last Date of this Revision: September 23, 2024

Purpose: create a primenumber application that prompts the user for a number then displays a message indicating whether the number is prime or not
Author: bilal 
School: CHHS
Course: Computer Programming 20

*/

//importing functions
import java.util.Scanner;

public class E1Primenumbers {
	public static void main(String args[]) {
		
		//creates a scanner class
		Scanner scanner = new Scanner(System.in);

		//asks user for input
		System.out.println("Please input your number.");
		
		//accepts user input
		int inputnumb = scanner.nextInt(); 
		
		
		//makes a variable to see if number is prime
		boolean isPrime = true;
		
		//if the inputed number is less then one its not prime
        if (inputnumb <= 1) {
            isPrime = false; // to change is prime variable to false saying the number is not prime
        } else { 
            for (int i = 2; i < inputnumb; i++) { //loop to cycle if number is a prime
                if (inputnumb % i == 0) { //if number can be divided without an reminds 
                    isPrime = false; // to change is prime variable to false saying the number is not prime
                    break; // to end loop
                }
            }
        }
        
        if (isPrime) { // if the number is prime to say it is prime
            System.out.println(inputnumb + " is a prime number.");
        } else {  // if the number is not prime to say it is not prime
            System.out.println(inputnumb + " is not a prime number.");
        }
	}
}



/* Screen Dump

Paste the output of your code here


Please input your number.
5
5 is a prime number.


Please input your number.
2945
2945 is not a prime number.



Please input your number.
190589524
190589524 is not a prime number.




Please input your number.
29
29 is a prime number.




*/