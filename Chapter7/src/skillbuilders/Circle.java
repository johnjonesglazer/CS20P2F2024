package skillbuilders;

public class Circle {
	
	private final double PI = 3.1415;
	
	private double r;
	
	
	public Circle()
	{
		r = 2.4;
	}
	
	
	public void setRadius(double t)
	{
		r = t;
	}
	
	public double getRadius()
	{
		return r;
	}
	

	public Circle(double rad)
	{
		r = rad;
	}
	
	public double circumference(){
		
		double circum = (2 * PI * r);
		return(circum);
	}
	
	
	

}
