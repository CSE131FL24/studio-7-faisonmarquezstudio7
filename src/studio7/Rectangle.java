package studio7;

public class Rectangle {

	private double length; //Member variables
	private double width;
	
	//Constructor:
	
	Rectangle(double l, double w) {
		
		length = l; 
		width = w;
	}
	
	public double getArea() {
		
		return length*width;
	}
	
	public double getPerimeter() {
	
		return 2*(length)+ 2*(width);
		
	}
	
	public boolean isSmaller(Rectangle r) { 
		
		if (this.getArea() < r.getArea()) {
		
			return true;
		}
	
		else return false;
	
	}
	
	public boolean isSquare() {
		
		if (length == width) {
			
			return true;
		}
		else return false;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
