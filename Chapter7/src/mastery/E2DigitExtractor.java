package mastery;

/*
Program: E2DigitExtractor.java          Last Date of this Revision: October 11, 2024

Purpose: Create a digit extractor application that prompts the user for an integer then displays the ones, tens, and hundreds digit of the number.


Author: bilal 
School: CHHS
Course: Computer Programming 20
*/

public class E2DigitExtractor {
	private int wholeNumber; //making these variables private and unaccessable
	private int onesPlace;
	private int tensPlace;
	private int hundredsPlace;
	
	
	public E2DigitExtractor(){ //creating main starting constructor
		wholeNumber = 0;
		onesPlace = 0;
		tensPlace = 0;
		hundredsPlace = 0;
	}
	
	public E2DigitExtractor(int w, int o, int t, int h){ //creating overloaded constructor
		wholeNumber = w;
		onesPlace = o;
		tensPlace = t;
		hundredsPlace = h;
	}
	
	public int showWhole(int input) {
		int wholeNumber = input;
		System.out.println("The whole number is " + wholeNumber + ".");
		return(wholeNumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
