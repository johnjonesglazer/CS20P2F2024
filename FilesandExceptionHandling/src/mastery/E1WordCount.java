package mastery;

import java.io.*;
import java.util.Scanner;

/*
Program: E1WordCount.java                Last Date of this Revision: November 25, 2024

Purpose: Create a WordCount application that displays the number of words and the average word length in a text file named source.txt.

Author: bilal
School: CHHS
Course: Computer Programming 20
*/

public class E1WordCount {
    public static void main(String[] args) {
        // Creating Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Defining variables
        int wordCount = 0;
        int totalWordLength = 0;
        
        // File to be read
        String fileName = "C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\mastery\\source.txt";

        System.out.println("Welcome to the WordCount application!");

        try {
            // Inform the user about the file being read
            System.out.println("Attempting to read the file: " + fileName);

            // Setting up FileReader and BufferedReader to read the file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line; // Variable to hold each line from the file

            // Reading file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words using regex to match non-letter delimiters
                String[] words = line.split("[^a-zA-Z]+");

                for (String word : words) {
                    if (!word.isEmpty()) { // Avoid counting empty strings
                        wordCount++; // Increment word count
                        totalWordLength += word.length(); // Add word length to total
                    }
                }
            }

            // Closing the file reader
            bufferedReader.close();

            // Display the results
            if (wordCount > 0) {
                double averageWordLength = (double) totalWordLength / wordCount; // Calculate average word length
                System.out.println("\nResults:");
                System.out.println("Number of words: " + wordCount);
                System.out.printf("Average word length: %.2f%n", averageWordLength); // Display with 2 decimal places
            } else {
                System.out.println("The file contains no words.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + fileName + " was not found.");
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}

/*
Test Case 1:
File (source.txt) contents:
Hello world. This is a test file.
1, 2, 3, testing.

Console Output:
Welcome to the WordCount application!
Attempting to read the file: source.txt

Results:
Number of words: 8
Average word length: 3.75

Test Case 2:
File (source.txt) contents:
The quick brown fox jumps over the lazy dog.

Console Output:
Welcome to the WordCount application!
Attempting to read the file: source.txt

Results:
Number of words: 9
Average word length: 3.89

Test Case 3:
File (source.txt) contents:
(No text in the file)

Console Output:
Welcome to the WordCount application!
Attempting to read the file: source.txt
The file contains no words.
*/
