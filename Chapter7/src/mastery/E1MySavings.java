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
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	public E1MySavings(){ //creating main starting constructor
		totalMoney = 0.00;
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	
	public E1MySavings(double moola, int p, int n, int d, int q) //creating overloaded constructor
	{
		totalMoney = moola;
		pennies = p;
		nickels = n;
		dimes = d;
		quarters = q;
		
	}
	
	
	//to display the total amount of money
	public double displayTotalMoney() {
		double totalMoney = (pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25); //calculates amount of money in account
		System.out.println("You have $" + totalMoney + " in your account."); //says how much is in the account
		return(totalMoney);//returns total money
	}
	
	//for when  user adds pennies
	public int addPennies (String straddedpennies){ //accepts how many pennies user adds
		
		try {//in case a error happens the code doesnt just end
			int addedpennies = Integer.parseInt(straddedpennies); //changes the input form user to int from string
			System.out.println("You have deposited " + addedpennies + " pennies!");
			System.out.println("");//creates white space
			pennies += addedpennies; //adds the amount of pennies the user added to the current amount of pennies
			return(pennies); //returns new amount of pennies
			
		} catch (Exception e) { //to not break code
			System.out.println("Something went wrong. Please try again.");//tells user to try again
			System.out.println("");//creates white space
			return(pennies);
			
		}
	}
	
	
	//for when  user adds nickels
	public int addNickels (String straddednickels){
		
		try {//in case a error happens the code doesnt just end
			int addednickels = Integer.parseInt(straddednickels); //changes the input form user to int from string
			System.out.println("You have deposited " + addednickels + " nickels!");
			System.out.println("");//creates white space
			nickels += addednickels; //adds the amount of nickels the user added to the current amount of nickels
			return(nickels); //returns new amount of nickels
			
		} catch (Exception e) { //to not break code
			System.out.println("Something went wrong. Please try again.");//tells user to try again
			System.out.println("");//creates white space
			return(nickels); //returns same amount of nickels
			
		}
	}
	
	//for when  user adds dimes
	public int addDimes (String straddeddimes){
		
		try {//in case a error happens the code doesnt just end
			int addeddimes = Integer.parseInt(straddeddimes); //changes the input form user to int from string
			System.out.println("You have deposited " + addeddimes + " dimes!");
			System.out.println("");//creates white space
			dimes += addeddimes; //adds the amount of dimes the user added to the current amount of dimes
			return(dimes); //returns new amount of dimes
			
		} catch (Exception e) { //to not break code
			System.out.println("Something went wrong. Please try again.");//tells user to try again
			System.out.println("");//creates white space
			return(dimes); //returns same amount of dimes
			
		}
		
	}
	
	
	//for when  user adds quarters
	public int addQuarters (String straddedquarters){
		
		try {//in case a error happens the code doesnt just end
			int addedquarters = Integer.parseInt(straddedquarters); //changes the input form user to int from string
			System.out.println("You have deposited " + addedquarters + " quarters!");
			System.out.println("");//creates white space
			quarters += addedquarters; //adds the amount of quarters the user added to the current amount of quarters
			return(quarters); //returns new amount of quarters
			
		} catch (Exception e) { //to not break code
			System.out.println("Something went wrong. Please try again.");//tells user to try again
			System.out.println("");//creates white space
			return(quarters); //returns same amount of quarters
			
		}
		
	}

	//when user takes money out of the bank
	public double withdrawMoney (String strwithdrawAmount) {
		try {
			int withdrawAmount = Integer.parseInt(strwithdrawAmount); //changes the input form user to int from string
			
			if (withdrawAmount <= totalMoney & withdrawAmount > 0) { //if function so it will only pass if the number the is less then the amount of money in the bank and more then 0
				totalMoney = (totalMoney - withdrawAmount); //removes user amount iof money from bank
				System.out.println("You have $" + totalMoney + " left in your account."); //says how much is left
				return(totalMoney); //returns total money
				
			} else { //will reject anything else as an answer
				System.out.println("Error. You can not withdraw that amount money from your bank.");//says error
				return(totalMoney); //returns total money
			}
		} catch (Exception e) {
			System.out.println("Something went wrong. Please try again.");
			return(totalMoney);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
