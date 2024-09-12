package mastery;

import java.util.Scanner;
public class E6Digits {

	
	public static void main(String[] args) {
		

        Scanner digit = new Scanner(System.in);
        System.out.println("Enter a 3 digit number.");

        int number = digit.nextInt();
        
    
        int digit1 = number % 10;
        int digit2 = number % 100;
        int digit3 = number / 100;
        digit2 = (digit2 - digit1) / 10;
        
        System.out.println("Ones place is " + digit1 + ".");
        System.out.println("Tens place is " + digit2 + ".");
        System.out.println("Hundreds place is " + digit3 + ".");
		    
	}
	
}
