
public class Rectangle {
	
	protected double width, length;
	
	public Rectangle(double l, double w) {
		width = w;
		length = l;
	}
	
	public void setWidth(double w) {
		width = w; 
	}
	 
	public double getWidth() {
		return width;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public double getLength() {
		return length;
	}

	public double getArea() {
		return width * length;
	}
	
	
	
}
