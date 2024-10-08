package skillbuilders;

public class RectangleTest {
	public static void main(String[] args)
	{
		Rectangle spot = new Rectangle();
		Rectangle spot2 = new Rectangle(5, 2);

		
		
		System.out.println("Length: " + spot.getLength());
		System.out.println("Width: " + spot.getWidth());
		System.out.println("Area: " + spot.area());
		System.out.println("Perimeter: " + spot.perimeter());
		System.out.println("Area Formula: " + spot.displayAreaFormula());
		
		if (spot.equals(spot2)) {
			System.out.println("Objects are equal.");
		} 
		else {
			System.out.println("Objects are not equal.");
		}
		
		
	}
	
}

