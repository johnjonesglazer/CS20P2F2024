package mastery;

/*

Program: E9GuessingGame.java          Last Date of this Revision: September 19, 2024

Purpose: Create the guessinggame application. 
Author: bilal 
School: CHHS
Course: Computer Programming 20

*/
//importing functions
import java.util.Scanner;
import java.util.Random;


public class E9GuessingGame {
	public static void main(String args[]) {
		
		//creates a random class and scanner class
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		//defining max and min values
		int max = 20;
		int min = 1;
		
		//generating random integers
		int computernumb = rand.nextInt(max - min + 1) + min;
		
		while (true) { //makes it so if user puts number higher then 20 it reasks for input
			System.out.println("Please input your guess from 1-20!"); //asking for input
			int playernumb = scanner.nextInt(); //accepting user input
			
			if (playernumb == 1001982) { //adds a cheat code if user enters a certain number
				System.out.println("The answer is " + computernumb + ". Don't tell anyone! ;)");//prints the answer
				continue; //restarts loop
			}
			
			if (playernumb > 20) { //checks to see if user number is higher then 20
				System.out.println("Your number has to be under 20."); //if it is then prints this
				continue;//restarts the loop.
			}
			
			System.out.println("Computer's number: " + computernumb + ".");//says computers number
			System.out.println("Player's number: " + playernumb + ".");//says players number
			
			
			if (playernumb == computernumb) { // if statement for if player wins
				System.out.println("You won!"); //congrats message
				break;//ends loop
			}
			
			else {//if player doesnt win
				System.out.println("Better luck next time.");//lose message
				break;//ends loop
			}
		}
		
	}
}

/* Screen Dump

Paste the output of your code here

Please input your guess from 1-20!
3
Computer's number: 4.
Player's number: 3.
Better luck next time.

Please input your guess from 1-20!
24
Your number has to be under 20.
Please input your guess from 1-20!
25
Your number has to be under 20.
Please input your guess from 1-20!
14
Computer's number: 12.
Player's number: 14.
Better luck next time.


(this is with a cheat code)
Please input your guess from 1-20!
1001982
The answer is 13. Don't tell anyone! ;)
Please input your guess from 1-20!
13
Computer's number: 13.
Player's number: 13.
You won!


 */
