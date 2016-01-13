import java.util.Scanner;

@SuppressWarnings("resource")
public class Calculator {

	double a,b; 
	String operator;
	
	public Calculator(){//constructor 
		a =0;
		b =0;
	}
	
	public double sum(double arg1, double arg2){
		return (arg1+arg2);
	}
	
	public double dif(double arg1, double arg2){
		return (arg1-arg2);
	}
	
	public double mul(double arg1, double arg2){
		return (arg1*arg2);
	}
	
	public double div(double arg1, double arg2){
		return (double)(arg1/arg2);
	}
	
	
	public static void main(String[] args) {
		// Allow the user to input a number
			
		Calculator calculate = new Calculator(); // creating an object of name root
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter first operand");
		
		calculate.a= reader.nextDouble(); // Scans the next token of the input as an int.
		System.out.println("Number entered by user is : "+calculate.a);
		
		Scanner reader1 = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter second operand");
		
		calculate.b= reader1.nextDouble(); // Scans the next token of the input as an int.
		System.out.println("Number entered by user is : "+calculate.b);
		
		Scanner reader2 = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a operator "+'+'+" or "+'-'+" or "+'*'+" or "+'/');
	
		calculate.operator= reader2.next(); // Scans the next token of the input as an int.
		System.out.println("Operator entered is : "+calculate.operator);
		
		switch(calculate.operator){
		
		case "+":
			System.out.println(calculate.sum( calculate.a, calculate.b));
			break;
			
		case "-":
			System.out.println(calculate.dif( calculate.a, calculate.b));
			break;
		
		case "*":
			System.out.println(calculate.mul( calculate.a, calculate.b));
			break;
		
		case "/":
			System.out.println(calculate.div( calculate.a, calculate.b));
			break;
		
		default:
			System.out.println("invalid operator is entered");
			break;
		
		}
	}
		
		
}
	
