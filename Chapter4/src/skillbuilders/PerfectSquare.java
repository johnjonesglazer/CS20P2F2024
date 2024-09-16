package skillbuilders;

import java.util.Scanner;
public class PerfectSquare {
	public static void main(String[] args) {
	
	Scanner scinput = new Scanner(System.in);
	System.out.print("What is number?");

	
    int number = scinput.nextInt();
    int sqrt = (int) Math.sqrt(number);
    int square = sqrt * sqrt;

    if (square == number) {
        System.out.println(number + " is a perfect square.");
    } else {
        System.out.println(number + " is not a perfect square.");
    }

		
		
		
	}
}
