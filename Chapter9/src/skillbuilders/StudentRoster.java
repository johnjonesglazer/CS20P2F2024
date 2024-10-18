package skillbuilders;

import java.util.Arrays;
import java.util.Scanner;
public class StudentRoster {
	
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		
		int selection;
		String strselection;
		
	
		
		
		
		
		

		while (true) {
			System.out.println("Enter number of students");
			strselection = scanner.nextLine();
			
			try {
				selection = Integer.parseInt(strselection);
				break;
				
			} catch (Exception e) {
				System.out.println("Something went wrong. Please try again.");
				System.out.println("");
				continue;
			}
		}
		String[] studentNames = new String[selection];
			
		for(int i = 0; i < selection; i++) {
			System.out.println("Student name: ");
			studentNames[i] = scanner.next();
		}
		Arrays.sort(studentNames);
		
		for(int i = 0; i < studentNames.length; i++) {
			
			System.out.println("Student name: " + studentNames[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
