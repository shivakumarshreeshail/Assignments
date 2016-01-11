//To check total number of days in the given month

import java.util.Scanner;
public class CheckDaysInMonth {

	private static final boolean leapYear = false;

	public static void main(String[] args) {
		int days=0;
		// Allow the user to input his/her age
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter name of month: ");
		String month = reader.next(); // Scans the next token of the input as an string.
		System.out.println("Name of the month entered is :"+month);
		
		switch (month.toLowerCase()) {
			case "january": 
				System.out.println("Number of days "+month+" month have : "+"31");
				break;
			case "february": 
				days = (leapYear) ? 29 : 28;
				System.out.println("Number of days "+month+" month have : "+days);
				break;
				
			case "march": 
				System.out.println("Number of days "+month+" month have : "+"31");
				break;
			
			case "april": 
				System.out.println("Number of days "+month+" month have : "+"30");
				break;
		
			case "may": 
				System.out.println("Number of days "+month+" month have : "+"31");
				break;

			case "june": 
				System.out.println("Number of days "+month+" month have : "+"30");
				break;	
		
			case "july": 
				System.out.println("Number of days "+month+" month have : "+"31");
				break;
				
			case "august": 
				System.out.println("Number of days "+month+" month have : "+"31");
				break;
			
			case "september": 
				System.out.println("Number of days "+month+" month have : "+"30");
				break;	
			
			case "october": 
				System.out.println("Number of days "+month+" month have : "+"31");
				break;	
				
			case "november": 
				System.out.println("Number of days "+month+" month have : "+"30");
				break;
			
			case "december": 
				System.out.println("Number of days "+month+" month have : "+"31");
				break;
				
			default:
				System.out.println("Invalid month name is entered.");
				break;
			
		}

	}

}
