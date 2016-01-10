import java.util.Scanner;

public class CanYouVote {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Allow the user to input his/her age
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a your age in years: ");
		int age = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("age entered by user is :"+age);
		if (age >= 18){
			System.out.println("You are eligible to vote");
		}else{
			System.out.println("You are not eligible to vote");
		}
	}
}
