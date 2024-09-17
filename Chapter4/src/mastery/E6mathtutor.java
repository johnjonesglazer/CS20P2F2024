package mastery;




/*

Program: E6Mathtutor.java          Last Date of this Revision: September 17, 2024

Purpose: Create a Math Tutor application that displays math problems by randomly generating two numbers, 1 through 10 and an operator (*, +, -, /), and then prompts the user for an answer.

Author: bilal 
School: CHHS
Course: Computer Programming 20
 

*/
//importing functions
import java.util.Scanner;
import java.util.Random;
public class E6mathtutor {
	public static void main(String args[]) {
		
		//creates a random class and scanner class
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		//defining max and min values
		int max = 10;
		int min = 1;
		
		//defining max for the operations
		int maxalt = 4;
		
		//generating random integers
		int rnumb1 = rand.nextInt(max - min + 1) + min;
		int rnumb2 = rand.nextInt(max - min + 1) + min;
		int rnumb3 = rand.nextInt(maxalt - min + 1) + min;
       
		
		//creating if statements for the operations
		//if for if addition is selected
		if (rnumb3 == 1) 
		{ 
			System.out.println(rnumb1 + "+" + rnumb2 + "="); 
			int answer1 = scanner.nextInt(); //asking for user input
			int rightanswer1 = rnumb1 + rnumb2; //calculating the correct answer
			if (rightanswer1 == answer1) { //checking if user input is correct
				System.out.println("Correct!");
			}
			
			else
			{ //if user gets the question wrong and says right answer
				System.out.println("Incorrect. The correct answer is " + rightanswer1 + ".");
			}		
		}
		
		//if for if subtraction is selected
		if (rnumb3 == 2) 
		{ 
			System.out.println(rnumb1 + "-" + rnumb2 + "="); 
			int answer2 = scanner.nextInt(); //asking for user input
			int rightanswer2 = rnumb1 - rnumb2; //calculating the correct answer
			if (rightanswer2 == answer2) { //checking if user input is correct
				System.out.println("Correct!");
			}
			
			else 
			{ //if user gets the question wrong and says right answer
				System.out.println("Incorrect. The correct answer is " + rightanswer2 + ".");
			}		
		}
		
		//if for if multiplication is selected
		if (rnumb3 == 3) 
		{ 
			System.out.println(rnumb1 + "*" + rnumb2 + "="); 
			int answer3 = scanner.nextInt(); //asking for user input
			int rightanswer3 = rnumb1 * rnumb2; //calculating the correct answer
			if (rightanswer3 == answer3) { //checking if user input is correct
				System.out.println("Correct!");
			}
			
			else 
			{ //if user gets the question wrong and says right answer
				System.out.println("Incorrect. The correct answer is " + rightanswer3 + ".");
			}		
		}
		
		//if for if division is selected
		if (rnumb3 == 4) 
		{ 
			System.out.println(rnumb1 + "/" + rnumb2 + "= (Rounded to the lowest whole number)"); 
			int answer4 = scanner.nextInt(); //asking for user input
			int rightanswer4 = rnumb1 / rnumb2; //calculating the correct answer
			if (rightanswer4 == answer4) { //checking if user input is correct
				System.out.println("Correct!");
			}
			
			else 
			{ //if user gets the question wrong and says right answer
				System.out.println("Incorrect. The correct answer is " + rightanswer4 + ".");
			}		
		}
		

		
    }
}



/* Screen Dump

Paste the output of your code here

1*4=
3
Incorrect. The correct answer is 4.


2*1=
2
Correct!

9-8=
4
Incorrect. The correct answer is 1.

2-6=
2
Incorrect. The correct answer is -4.

1-6=
-5
Correct!

 */








