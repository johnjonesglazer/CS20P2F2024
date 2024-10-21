package mastery;

/*
Program: E12GradeBook.java          Last Date of this Revision: October 21, 2024

Purpose: Create a CourseGrades application that simulates a grade book for a class with 12 students that each have 5 test scores.



Author: bilal 
School: CHHS
Course: Computer Programming 20
*/




import java.util.Scanner;

public class E12GradeBook {
    private int[][] grades; // 2D array to store grades for 12 students and 5 tests
    private int numStudents;
    private int numTests;

    // Constructor
    public E12GradeBook(int numStudents, int numTests) {
        this.numStudents = numStudents;
        this.numTests = numTests;
        grades = new int[numStudents][numTests]; // Initialize the 2D array
    }

    // Method to prompt the user for grades
    public void getGrades() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < numTests; j++) {
                System.out.print("Test " + (j + 1) + ": ");
                grades[i][j] = input.nextInt(); // Input grade for each test
            }
        }
    }

    // Method to display all grades for the class
    public void showGrades() {
        System.out.println("\nClass Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < numTests; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println(); // Move to the next line after displaying grades for a student
        }
    }

    // Method to calculate the average grade for a specific student
    public double studentAvg(int studentNumber) {
        int total = 0;
        for (int j = 0; j < numTests; j++) {
            total += grades[studentNumber][j]; // Sum the grades for the student
        }
        return (double) total / numTests; // Return the average
    }

    // Method to calculate the average grade for a specific test
    public double testAvg(int testNumber) {
        int total = 0;
        for (int i = 0; i < numStudents; i++) {
            total += grades[i][testNumber]; // Sum the grades for the test
        }
        return (double) total / numStudents; // Return the average
    }
}
