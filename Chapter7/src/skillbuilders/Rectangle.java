package skillbuilders;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle() 
	{
		width = 5;
		length = 13;
	}
	
	public Rectangle(double w, double l) 
	{
		width = w;
		length = l;
		
	}
	
	public void setWidth(double w){
		width = w;
	}
	
	public void setLength(double l){
		length = l;
	}
	
	public double getWidth() {
		return(width);
	}
	
	public double getLength() {
		return(length);
	}
	
	public double area() {
		double a = width * length;
		return(a);
	}
	
	public double perimeter() {
		double p = 2 * width + 2 * length;
		return(p);
	}
	
}
