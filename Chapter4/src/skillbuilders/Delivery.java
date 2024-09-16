package skillbuilders;

import java.util.Scanner;

public class Delivery {
	public static void main(String[] args) {
	
	Scanner scinput = new Scanner(System.in);
	
	System.out.print("What is your length?");
	int length = scinput.nextInt();
	System.out.print("What is your width?");
	int width = scinput.nextInt();
	System.out.print("What is your height?");
	int height = scinput.nextInt();
	
	boolean length1 = length > 10;
	boolean width1 = width > 10;
	boolean height1 = height > 10;
	boolean answer = length1 || width1 || height1;
	
	if (answer == false) {
		System.out.print("Accept.");
		}
	else {
		System.out.print("Reject.");
	}
	}
}
