package mastery;
import java.util.Scanner;

/*
Program: E8Palindrome.java          Last Date of this Revision: October 21, 2024

Purpose: Create a Palindrome application that prompts the user for a string and then displays a message indicating whether or not the string is a palindrome.


Author: bilal 
School: CHHS
Course: Computer Programming 20
*/


public class E8Palindrome {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a word or phrase: ");
        String phrase = input.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(phrase)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove all non-alphabetic characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Reverse the cleaned string
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Check if the cleaned string is equal to its reverse
        return cleanedStr.equals(reversedStr);
    }
}


/*


test case 1

Enter a word or phrase: 
mom
The entered string is a palindrome.


test case 2

Enter a word or phrase: 
kayak
The entered string is a palindrome.


test case 3

Enter a word or phrase: 
dude
The entered string is not a palindrome.



*/