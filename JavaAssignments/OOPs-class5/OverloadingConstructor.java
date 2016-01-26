
public class OverloadingConstructor {

	public OverloadingConstructor(int i, int j) {
		// TODO Auto-generated constructor stub
		System.out.print("Area of Square for the given height : " + i + " and width: " + j + " is " + i * j+"\n");
	}

	public OverloadingConstructor(double d, double e) {
		// TODO Auto-generated constructor stub
		System.out.print("Area of rectangle for the given height : " + d + " and width: " + e + " is " + d * e+"\n");
	}

	public static void main(String[] args) {

		OverloadingConstructor AreaOfSquare = new OverloadingConstructor(12, 14);

		OverloadingConstructor AreaOfReactangle = new OverloadingConstructor(12.5, 14.5);
	}

}
