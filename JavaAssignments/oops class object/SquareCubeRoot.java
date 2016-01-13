import java.util.Scanner;

@SuppressWarnings("resource")
public class SquareCubeRoot {

	double num;
	
	public SquareCubeRoot(){//constructor 
		num = 0;
	}
	
	public double squareroot(double arg1){ // member function to calculate square root
		
		return Math.sqrt(arg1);
	}
	
	public double Cuberoot(double arg1){ // member function to calculate cube root
		
		return Math.cbrt(arg1);
	}
	
	public static void main(String[] args) {
		// Allow the user to input a number
			
		SquareCubeRoot root = new SquareCubeRoot(); // creating an object of name root
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number to find square root and cube root");
		
		root.num= reader.nextDouble(); // Scans the next token of the input as an int.
		System.out.println("Number entered by user is : "+root.num);
		System.out.println("square root of "+root.num+" is : "+root.squareroot(root.num));
		System.out.println("cube root of "+root.num+" is : "+root.Cuberoot(root.num));
		
	}
	
}

