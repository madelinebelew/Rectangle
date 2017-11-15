import java.util.Scanner;

public class RectangleTester {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Rectangle Width: ");
	double w = input.nextDouble();
	System.out.print("Rectangle Length: ");
	double l = input.nextDouble();
	
	Rectangle myRectangle = new Rectangle(w, l);
	
	System.out.println("Rectangle Area: " + myRectangle.getArea());
	
	System.out.print("Square Width: ");
	double squareW = input.nextDouble();
	
	Square mySquare = new Square(squareW);

	System.out.println("Square area: " + mySquare.getArea());
	
	System.out.println("Square diagonal: " + mySquare.getDiagonal());
	
	input.close();
	
	asD
	as
	d
	}
}
