package mastery;


import java.text.NumberFormat;

/*
Program: E12CourseGrades.java          Last Date of this Revision: October 21, 2024

Purpose: Create a CourseGrades application that simulates a grade book for a class with 12 students that each have 5 test scores.



Author: bilal 
School: CHHS
Course: Computer Programming 20
*/



import java.util.Scanner;

public class E12CourseGrades {

    public static void main(String[] args) {
        E12GradeBook gradeBook = new E12GradeBook(1, 5); // 12 students and 5 test scores
        

        gradeBook.getGrades();  // Prompt the user to enter grades for each student
        gradeBook.showGrades(); // Display the grades

        Scanner input = new Scanner(System.in);

        // Calculate and display average grade for a student
        System.out.println("Enter a student number (1-12) to get their average score: ");
        int studentNumber = input.nextInt();
        double studentAvg = gradeBook.studentAvg(studentNumber - 1); // Student number input is 1-based
        System.out.println("Average score for student " + studentNumber + ": " + studentAvg + "%");

        // Calculate and display average grade for a test
        System.out.println("Enter a test number (1-5) to get the average score for that test: ");
        int testNumber = input.nextInt();
        double testAvg = gradeBook.testAvg(testNumber - 1); // Test number input is 1-based
        System.out.println("Average score for test " + testNumber + ": " + testAvg + "%");
    }
}







/*

test case 1

Enter grades for student 1:
Test 1: 68
Test 2: 68
Test 3: 64
Test 4: 91
Test 5: 23
Enter grades for student 2:
Test 1: 82
Test 2: 67
Test 3: 43
Test 4: 91
Test 5: 02
Enter grades for student 3:
Test 1: 56
Test 2: 3
Test 3: 86
Test 4: 34
Test 5: 35
Enter grades for student 4:
Test 1: 87
Test 2: 65
Test 3: 57
Test 4: 32
Test 5: 90
Enter grades for student 5:
Test 1: 12
Test 2: 24
Test 3: 60
Test 4: 18
Test 5: 100
Enter grades for student 6:
Test 1: 23
Test 2: 25
Test 3: 17
Test 4: 13
Test 5: 23
Enter grades for student 7:
Test 1: 67
Test 2: 23
Test 3: 25
Test 4: 12
Test 5: 89
Enter grades for student 8:
Test 1: 78
Test 2: 42
Test 3: 46
Test 4: 87
Test 5: 56
Enter grades for student 9:
Test 1: 78
Test 2: 97
Test 3: 42
Test 4: 3
Test 5: 4
Enter grades for student 10:
Test 1: 5
Test 2: 6
Test 3: 7
Test 4: 8
Test 5: 45
Enter grades for student 11:
Test 1: 4
Test 2: 5
Test 3: 54
Test 4: 7
Test 5: 84
Enter grades for student 12:
Test 1: 48
Test 2: 24
Test 3: 34
Test 4: 6
Test 5: 78

Class Grades:
Student 1: 68 68 64 91 23 
Student 2: 82 67 43 91 2 
Student 3: 56 3 86 34 35 
Student 4: 87 65 57 32 90 
Student 5: 12 24 60 18 100 
Student 6: 23 25 17 13 23 
Student 7: 67 23 25 12 89 
Student 8: 78 42 46 87 56 
Student 9: 78 97 42 3 4 
Student 10: 5 6 7 8 45 
Student 11: 4 5 54 7 84 
Student 12: 48 24 34 6 78 
Enter a student number (1-12) to get their average score: 
5
Average score for student 5: 42.8
Enter a test number (1-5) to get the average score for that test: 
2
Average score for test 2: 37.4








*/