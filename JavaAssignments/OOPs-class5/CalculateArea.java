class Area {
	double Area;

	public void AreaOfRectangle(double height, double width) {
		System.out.println("Area of Reactangle for the given" + " height " + height + " and width " + width + " is: "
				+ height * width);
	}

	public void AreaOfTriangle(double length, double bredth) {
		System.out.println("Area of triangle for the given" + " length " + length + " and bredth " + bredth + " is: "
				+ 0.5 * length * bredth);
	}
}

public class CalculateArea extends Area {

	public static void main(String[] args) {
		CalculateArea A = new CalculateArea();
		A.AreaOfRectangle(2.5, 3.5);
		A.AreaOfTriangle(5.4, 4);

	}

}
