package mastery;

public class E3LunchOrder {
	
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

	
	
	
	public double totalPrice(int burgers,  int salads, int fries, int sodas, double burgersprice, double saladsprice, double friesprice, double sodasprice){
		double totalprice = (burgers * burgersprice) + (salads * saladsprice) + (fries * friesprice) + (sodas * sodasprice);
		
		return (totalprice);
	}
	
	
/*	
	public double totalCost(int burger, int salads, int fries, int sodas) 
	{
		double totalHam = 
		
		
		return(totalCost);
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
