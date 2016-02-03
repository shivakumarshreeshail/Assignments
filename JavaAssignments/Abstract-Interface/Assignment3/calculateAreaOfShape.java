package ClaculateArea;

import java.util.Scanner;

public class calculateAreaOfShape implements Shape {

	public static void main(String[] args) {
		Shape d1 = new calculateAreaOfShape();
		d1.Draw();
		
	}

	@Override
	public void Draw() {
		int ch;
		@SuppressWarnings("resource")
		Scanner sin = new Scanner(System.in);
		

		do {
			System.out.println("1.RECTANGLE(default)");
			System.out.println("2.TRIANGLE");
			System.out.println("3.ELLIPSE");
			System.out.print("Enter ur choice:");
			ch = sin.nextInt();
			switch (ch) {
			case 1:
				String Shape = "Rectangle";
				GetArea(Shape);
				break;
			case 2:
				String Shape1 = "Triangle";
				GetArea(Shape1);
				break;
			case 3:
				String Shape2 = "Ellipse";
				GetArea(Shape2);
				break;
			default:

				String Shape3 = "Rectangle";
				GetArea(Shape3);
				System.out.println("Enter correct Choice");
				break;
			}

			System.out.print("Do u want to continue:");
			ch = sin.nextInt();
		} while (ch == 1);
		//System.out.println("Exiting");
		

	}

	@Override
	public void GetArea(String Type) {
		
		double Area;
		double D1, D2;
		System.out.println("Enter two dimensions:");

		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		D1 = a.nextInt();

		@SuppressWarnings("resource")
		Scanner b = new Scanner(System.in);
		D2 = b.nextInt();

		System.out.println("D1:" + D1 + "\nD2:" + D2);

		if (Type == "Rectangle") {
			Area = D1 * D2;
			System.out.print("Area : " + Area);
		} else if (Type == "Triangle") {
			Area = 0.5 * D1 * D2;
			System.out.print("Area : " + Area);
		} else if (Type == "Ellipse") {
			Area = 0.5 * D1 * D2;
			System.out.print("Area : " + Area);
		}

	}

}
