package skillbuilders;

import java.util.Scanner;

public class Hurricane {
	public static void main(String[] args) {
	
	Scanner scinput = new Scanner(System.in);
	
	String cat1 = "119-153km/hr.";
	String cat2 = "154-177hm/hr.";
	String cat3 = "178-209km/hr.";
	String cat4 = "210-249km/hr.";
	String cat5 = "greater then 250km/hr.";
	
	
	
	System.out.print("What category is your hurricane(1-5)?");

	int input = scinput.nextInt();
	
		if (input == 1) 
		{ 
			System.out.print("Hurricane speeds are " + cat1);
		}
		if (input == 2) 
		{ 
			System.out.print("Hurricane speeds are " + cat2);
		}
		if (input == 3) 
		{ 
			System.out.print("Hurricane speeds are " + cat3);
		}
		if (input == 4) 
		{ 
			System.out.print("Hurricane speeds are " + cat4);
		}
		if (input == 5) 
		{ 
			System.out.print("Hurricane speeds are " + cat5);
		}
	}
}
