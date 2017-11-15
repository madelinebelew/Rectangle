

public class Square extends Rectangle { 
	
	public Square(double w) {
		super(w, w);
	}
	
	public double getDiagonal() {
		return width * Math.sqrt(2); 
	}
}
