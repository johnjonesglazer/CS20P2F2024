package mastery;

/*

Program: E8GuessingGame.java          Last Date of this Revision: September 20, 2024

Purpose: modify the guessinggame application to allow for as many guesses as needed
Author: bilal 
School: CHHS
Course: Computer Programming 20

*/
//importing functions
import java.util.Scanner;
import java.util.Random;


public class E8GuessingGame {
	public static void main(String args[]) {
		
		//creates a random class and scanner class
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		//defining max and min values
		int max = 20;
		int min = 1;
		
		//generating random integers
		int computernumb = rand.nextInt(max - min + 1) + min;
		
		while (true) { //makes it so if user puts number higher then 20 it reasks for input and if they get answer wrong it will ask again
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
			
			
			
			if (playernumb == computernumb) { // if statement for if player wins
				System.out.println("You won!"); //congrats message
				break;//ends loop
			} 
			
			else if (playernumb != computernumb) {//if player doesnt win
				System.out.println("Try again.");//tells them to try again
				continue;//restarts loop
			}
		}
	}
}

/* Screen Dump

Paste the output of your code here




Please input your guess from 1-20!
5
Try again.
Please input your guess from 1-20!
1
Try again.
Please input your guess from 1-20!
20
You won!




Please input your guess from 1-20!
19
Try again.
Please input your guess from 1-20!
145
Your number has to be under 20.
Please input your guess from 1-20!
14
Try again.
Please input your guess from 1-20!
1001982
The answer is 8. Don't tell anyone! ;)
Please input your guess from 1-20!
8
You won!








Please input your guess from 1-20!
158
Your number has to be under 20.
Please input your guess from 1-20!
25
Your number has to be under 20.
Please input your guess from 1-20!
23
Your number has to be under 20.
Please input your guess from 1-20!
19
Try again.
Please input your guess from 1-20!
3
Try again.
Please input your guess from 1-20!
7
Try again.
Please input your guess from 1-20!
3
Try again.
Please input your guess from 1-20!
17
Try again.
Please input your guess from 1-20!


 */
