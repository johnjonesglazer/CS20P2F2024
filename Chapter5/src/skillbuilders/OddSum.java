package skillbuilders;


import java.util.Scanner;
public class OddSum {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input a number."); 
		int userinput = scanner.nextInt();
		int sum = 0;
		
		for (int x = 1; x <= userinput; x++) {
			if (x % 2 != 0) {
				sum += x;
			}
		}
		System.out.println("The sum of all odd numbers is " + sum + "."); 
		scanner.close();
	}
}
