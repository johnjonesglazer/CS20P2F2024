package mastery;

import java.io.*;
import java.util.Scanner;

/*
Program: E10FindAndReplace.java           Last Date of this Revision: November 25, 2024

Purpose: Create a Find And Replace application that replaces all occurrences of a specified word/phrase with another in a text file.

Author: bilal
School: CHHS
Course: Computer Programming 20
*/

public class E10FindAndReplace {
    public static void main(String[] args) {
        // Creating Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // User inputs
        String fileName, searchPhrase, replacementPhrase;

        System.out.println("Welcome to the Find And Replace application!");

        try {
            // Prompt user for file name
            System.out.print("Enter the file name to process: ");
            fileName = scanner.nextLine();

            // Prompt user for the search phrase
            System.out.print("Enter the word/phrase to search for: ");
            searchPhrase = scanner.nextLine();

            // Prompt user for the replacement phrase
            System.out.print("Enter the replacement word/phrase: ");
            replacementPhrase = scanner.nextLine();

            // Check if the file exists
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("The file " + fileName + " does not exist.");
            }

            // Reading the file content
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder fileContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                // Append lines to the StringBuilder
                fileContent.append(line).append("\n");
            }
            reader.close();

            // Perform find and replace
            String updatedContent = fileContent.toString().replace(searchPhrase, replacementPhrase);

            // Overwriting the file with updated content
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(updatedContent);
            writer.close();

            System.out.println("\nAll occurrences of \"" + searchPhrase + "\" have been replaced with \"" + replacementPhrase + "\".");
            System.out.println("The changes have been saved to the file: " + fileName);

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while processing the file.");
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}

/*
Test Case 1:
File (example.txt) contents:
Hello world! This is a test file.
The world is beautiful.

Console Input:
Enter the file name to process: example.txt
Enter the word/phrase to search for: world
Enter the replacement word/phrase: universe

Console Output:
All occurrences of "world" have been replaced with "universe."
The changes have been saved to the file: example.txt

Updated File Contents:
Hello universe! This is a test file.
The universe is beautiful.

Test Case 2:
File (example.txt) contents:
Programming is fun.
Programming is challenging.

Console Input:
Enter the file name to process: example.txt
Enter the word/phrase to search for: Programming
Enter the replacement word/phrase: Coding

Console Output:
All occurrences of "Programming" have been replaced with "Coding."
The changes have been saved to the file: example.txt

Updated File Contents:
Coding is fun.
Coding is challenging.

Test Case 3:
File (example.txt) contents:
(No text in the file)

Console Input:
Enter the file name to process: example.txt
Enter the word/phrase to search for: test
Enter the replacement word/phrase: example

Console Output:
All occurrences of "test" have been replaced with "example."
The changes have been saved to the file: example.txt

Updated File Contents:
(No text in the file)
*/
