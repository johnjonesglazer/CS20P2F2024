package skillbuilders;


import java.util.Scanner;
public class NumbersSum {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input a number."); 
		int userinput = scanner.nextInt();
		int sum = 0;
		
		for (int x = 1; x <= userinput; x++) {
			System.out.println(x);
			sum += x;
		}
		System.out.println("The sum of all numbers is " + sum + "."); 
		
	}
}
