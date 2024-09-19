package mastery;


/*

Program: E11QuadraticEquation.java          Last Date of this Revision: September 19, 2024

Purpose:create a QuadraticEquation application that gives the solution to any quadratic equation
Author: bilal 
School: CHHS
Course: Computer Programming 20
 

*/

//imports functions
import java.util.Scanner;

public class E11QuadraticEquation {
    public static void main(String[] args) {
        
        // create scanner object to get input from user
        Scanner scanner = new Scanner(System.in);
        
        // ask user for input for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the value for c: ");
        double c = scanner.nextDouble();
        
        // calculate discriminant (b^2 - 4ac)
        double discriminant = (b * b) - (4 * a * c);
        
        // check if discriminant is positive, negative or zero
        if (discriminant > 0) {
            // if positive, two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2 + ".");
        } else if (discriminant == 0) {
            // if zero, one real root
            double root = -b / (2 * a);
            System.out.println("The root is " + root + ".");
        } else {
            // if negative, no real roots
            System.out.println("There are no real roots.");
        }
        
    }
}



/* Screen Dump

Paste the output of your code here


Enter the value for a: 5
Enter the value for b: 23
Enter the value for c: -109
The roots are 2.904805471869242 and -7.504805471869242.

Enter the value for a: 8
Enter the value for b: 2
Enter the value for c: 6
There are no real roots.





*/
