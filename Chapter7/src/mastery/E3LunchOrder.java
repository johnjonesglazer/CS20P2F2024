package mastery;

import java.text.DecimalFormat;

/*
Program: E3LunchOrder.java          Last Date of this Revision: October 17, 2024

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total for the order.

Author: bilal 
School: CHHS
Course: Computer Programming 20
*/


public class E3LunchOrder {
	DecimalFormat dc = new DecimalFormat("0.00"); // to convert decimals to the nearest hundredth
	
	private int hamburgers; //creates private variables
	private int salads;
	private int fries;
	private int sodas;
	private double price;
	private int fat;
	private int carb;
	private int fiber;
	
	
	public E3LunchOrder(){ //makes the starting number 0 
		hamburgers = 0;
		salads = 0;
		fries = 0;
		sodas = 0;
	}
	
	public E3LunchOrder(double p, int fa, int c, int fi){ //to have multiple prices and values for each food type
		price = p;
		fat = fa;
		carb = c;
		fiber = fi;
		
	}
	
	public double showPrice() {//shows the price of which ever food type
		
		return(price);
	}
	
	public double showFat() {//shows the fat of which ever food type
			
			return(fat);
		}
		
	public double showCarb() {//shows the carbs of which ever food type
		
		return(carb);
	}
	
	public double showFiber() {//shows the fiber of which ever food type
		
		return(fiber);
	}

	
	
	
	public double totalPrice(int burgers,  int salads, int fries, int sodas, double burgersprice, double saladsprice, double friesprice, double sodasprice){ // method to get total price
		double totalprice = (burgers * burgersprice) + (salads * saladsprice) + (fries * friesprice) + (sodas * sodasprice); //multiples the food item by its price and adds them all together
		String strtotalprice = (dc.format(totalprice));//rounds to nearest hundreth
		totalprice = Double.parseDouble(strtotalprice);//changes rounded totalprice from string back to double
		return (totalprice);//returns the total price of the order
	}

}
