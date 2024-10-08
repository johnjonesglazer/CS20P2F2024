package mastery;

/*
Program: E1MySavings.java          Last Date of this Revision: October 8, 2024

Purpose: Create a Mysavings application that displays a menu of choices for entering pennies nickels dimes and quarters in to a piggy bank then prompts user to make a selection.

Author: bilal 
School: CHHS
Course: Computer Programming 20
*/


public class E1MySavings {
	private double totalMoney; //making these variables private and unaccessable
	private double pennies;
	private double nickels;
	private double dimes;
	private double quarters;
	
	public E1MySavings(){ //creating main starting constructor
		totalMoney = 0;
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	
	public E1MySavings(double moola, double p, double n, double d, double q) //creating overloaded constructor
	{
		totalMoney = moola;
		double pennies = p;
		double nickels = n;
		double dimes = d;
		double quarters = q;
		
	}
	
	
	public double displayTotalMoney(double displaytotalMoney) {
		double totalMoney = (pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25);
		return(totalMoney);
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
