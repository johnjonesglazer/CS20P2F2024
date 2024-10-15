package mastery;

/*
Program: E2DigitExtractor.java          Last Date of this Revision: October 11, 2024

Purpose: Create a digit extractor application that prompts the user for an integer then displays the ones, tens, and hundreds digit of the number.


Author: bilal 
School: CHHS
Course: Computer Programming 20
*/
import static java.lang.Math.abs;
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
	
	public int showWhole(int input) { //method to show whole
		int wholeNumber = input; //accepts input 
		System.out.println("The whole number is " + wholeNumber + "."); //prints whole number
		return(wholeNumber); //returns whole number
	}
	
	public int showOnesplace(int input) { //method to show ones place
		int wholeNumber = input; //accepts input
		int onesPlace = wholeNumber - ((wholeNumber / 10) * 10);// gets rid of everything except the ones place
		onesPlace = abs(onesPlace); //converts to absolute value in case number happens to be negative
		System.out.println("The ones place number is " + onesPlace + "."); //prints ones place
		return(onesPlace);//returns ones place
	}
	
	
	public int showTensplace(int input) {//method to show tens place
		int wholeNumber = input;//accepts input
		int tensPlace = (wholeNumber / 10) - (wholeNumber / 100) * 10 ;// gets rid of everything except the tens place
		tensPlace = abs(tensPlace); //converts to absolute value in case number happens to be negative
		System.out.println("The tens place number is " + tensPlace + "."); //prints tens place
		return(tensPlace);//returns tens place
	}
	
	public int showHundredsplace(int input) {//method to show hundreds place
		int wholeNumber = input;//accepts input
		int hundredsPlace = wholeNumber / 100;// gets rid of everything except the hundreds place
		hundredsPlace = abs(hundredsPlace);  //converts to absolute value in case number happens to be negative
		System.out.println("The hundreds place number is " + hundredsPlace + ".");//prints hundreds place
		return(hundredsPlace); //returns hundreds place
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
