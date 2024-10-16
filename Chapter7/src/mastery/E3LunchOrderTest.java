package mastery;



import java.util.Scanner;//imports scanner
public class E3LunchOrderTest {
	public static void main(String[] args){
	
		E3LunchOrder hamburger = new E3LunchOrder(1.85, 9, 33, 1); //creates the objects of foodtypes with different prices and foodvalues
		E3LunchOrder salad = new E3LunchOrder(2.00, 1, 11, 5);
		E3LunchOrder fries = new E3LunchOrder(1.30, 11, 36, 4);
		E3LunchOrder soda = new E3LunchOrder(0.95, 0, 38, 0);
		E3LunchOrder spot = new E3LunchOrder();
		
		
		//defining varibles
		int selection;
		int Qburgers;
		int Qsalads;
		int Qfries;
		int Qsoda;
		
		
		//creates scanner
		Scanner scanner = new Scanner(System.in);
	
		
		
		while (true) { //loop incase user enters wrong thing
			try {
				System.out.println("Enter number of hamburgers."); 
				String strselection = scanner.nextLine(); //accepts string from user
				
				try { //so the code doesnt just break and end
					selection = Integer.parseInt(strselection);
				} catch (Exception e) { //catches an error
					System.out.println("Something went wrong. Please try again.");//tells user to try again
					System.out.println("");//creates white space
					continue;//restarts loop
				}
				System.out.println("Each hamburger has " + hamburger.showFat() + "g of fat, " + hamburger.showCarb() + "g of carbs, and " + hamburger.showFiber() + "g of fiber."); 
				Qburgers = selection; //gives value to the amount of burgers
				break;//breaks loop
				
			}catch (Exception e) { //catches an error
				System.out.println("Something went wrong. Please try again.");//tells user to try again
				System.out.println("");//creates white space
				continue;//restarts loop
			}
		}
			
			
			while (true) { //loop incase user enters wrong thing
				try {
					System.out.println("Enter number of salads."); 
					String strselection = scanner.nextLine(); //accepts string from user
					
					try { //so the code doesnt just break and end
						selection = Integer.parseInt(strselection);
					} catch (Exception e) { //catches an error
						System.out.println("Something went wrong. Please try again.");//tells user to try again
						System.out.println("");//creates white space
						continue;//restarts loop
					}
					System.out.println("Each salad has " + salad.showFat() + "g of fat, " + salad.showCarb() + "g of carbs, and " + salad.showFiber() + "g of fiber."); 
					Qsalads = selection; //gives value to the amount of salads
					break;//breaks loop
					
				}catch (Exception e) { //catches an error
					System.out.println("Something went wrong. Please try again.");//tells user to try again
					System.out.println("");//creates white space
					continue;//restarts loop
				}
			}
			
			
			while (true) { //loop incase user enters wrong thing
				try {
					System.out.println("Enter number of fries."); 
					String strselection = scanner.nextLine(); //accepts string from user
					
					try { //so the code doesnt just break and end
						selection = Integer.parseInt(strselection);
					} catch (Exception e) { //catches an error
						System.out.println("Something went wrong. Please try again.");//tells user to try again
						System.out.println("");//creates white space
						continue;//restarts loop
					}
					System.out.println("Each fries has " + fries.showFat() + "g of fat, " + fries.showCarb() + "g of carbs, and " + fries.showFiber() + "g of fiber."); 
					Qfries = selection; //gives value to the amount of fries
					break;//breaks loop
					
				}catch (Exception e) { //catches an error
					System.out.println("Something went wrong. Please try again.");//tells user to try again
					System.out.println("");//creates white space
					continue;//restarts loop
				}
			}
			
			while (true) { //loop incase user enters wrong thing
				try {
					System.out.println("Enter number of soda."); 
					String strselection = scanner.nextLine(); //accepts string from user
					
					try { //so the code doesnt just break and end
						selection = Integer.parseInt(strselection);
					} catch (Exception e) { //catches an error
						System.out.println("Something went wrong. Please try again.");//tells user to try again
						System.out.println("");//creates white space
						continue;//restarts loop
					}
					System.out.println("Each soda has " + soda.showFat() + "g of fat, " + soda.showCarb() + "g of carbs, and " + soda.showFiber() + "g of fiber."); 
					Qsoda = selection; //gives value to the amount of soda
					break;//breaks loop
					
				}catch (Exception e) { //catches an error
					System.out.println("Something went wrong. Please try again.");//tells user to try again
					System.out.println("");//creates white space
					continue;//restarts loop
				}
			}
			
			double totalCost = spot.totalPrice(Qburgers, Qsalads, Qfries, Qsoda, hamburger.showPrice(), salad.showPrice(), fries.showPrice(), soda.showPrice()); //runs method  totalprice to get total price
			System.out.println("Your order comes to: $" + totalCost); //prints final cost
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
