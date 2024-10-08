package skillbuilders;

public class CircleTest {

	public static void main(String[] args)
	{
		Circle spot = new Circle();
		Circle spot2 = new Circle(4);
		
		
		spot.setRadius(3);
		
		System.out.println("Circle radius " + spot.getRadius());
		System.out.println("Circle circumference " + spot.circumference());
		System.out.println("Area Formula: " + spot.displayAreaFormula());
		if (spot.equals(spot2)) {
			System.out.println("Objects are equal.");
		} 
		else {
			System.out.println("Objects are not equal.");
		}
	}
	
}
