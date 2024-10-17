package mastery;


/*
Program: E3LunchOrderTest.java          Last Date of this Revision: October 17, 2024

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total for the order.

Author: bilal 
School: CHHS
Course: Computer Programming 20
*/





import java.util.Scanner;//imports scanner
public class E3LunchOrderTest {
	public static void main(String[] args){
	
		E3LunchOrder hamburger = new E3LunchOrder(1.85, 9, 33, 1); //creates the objects of food types with different prices and food values
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
			try { //code will loop back instead of breaking in case of error
				System.out.println("Enter number of hamburgers."); 
				String strselection = scanner.nextLine(); //accepts string from user
				
				try { //code will loop back instead of breaking in case of error
					selection = Integer.parseInt(strselection);//changes input from string to int
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
				try { //code will loop back instead of breaking in case of error
					System.out.println("Enter number of salads."); 
					String strselection = scanner.nextLine(); //accepts string from user
					
					try { //so the code doesnt just break and end
						selection = Integer.parseInt(strselection);//changes input from string to int
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
				try { //code will loop back instead of breaking in case of error
					System.out.println("Enter number of fries."); 
					String strselection = scanner.nextLine(); //accepts string from user
					
					try { //so the code doesnt just break and end
						selection = Integer.parseInt(strselection);//changes input from string to int
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
				try { //code will loop back instead of breaking in case of error
					System.out.println("Enter number of soda."); 
					String strselection = scanner.nextLine(); //accepts string from user
					
					try { //so the code doesnt just break and end
						selection = Integer.parseInt(strselection);//changes input from string to int
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




/*
test case 1

Enter number of hamburgers.
19
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.
Enter number of salads.
257
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.
Enter number of fries.
1
Each fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.
Enter number of soda.
0
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.
Your order comes to: $550.5



test case 2

Enter number of hamburgers.
15
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.
Enter number of salads.
23
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.
Enter number of fries.
w
Something went wrong. Please try again.

Enter number of fries.
7
Each fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.
Enter number of soda.
1
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.
Your order comes to: $83.8



test case 3

Enter number of hamburgers.
78
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.
Enter number of salads.
w
Something went wrong. Please try again.

Enter number of salads.
5
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.
Enter number of fries.
1
Each fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.
Enter number of soda.
5
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.
Your order comes to: $160.35


*/


